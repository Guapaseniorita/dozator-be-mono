package io.dozator.domain

import java.math.BigDecimal
import kotlin.math.pow

interface DosePresenter {
    override fun toString() : String
}

open class Dose<I>(
    private var value: I,
    private val configuration: Configuration<I> = Configuration(),
) : DosePresenter where I: Number, I: Comparable<I> {

    init {
        configuration.max?.let { value = if (value > it) it else value }
        configuration.min?.let { value = if (value < it) it else value }
    }

    override fun toString() : String {
        return "${formatValue(value)} ${configuration.unit}"
    }

    fun value(): I = value

    protected fun formatValue(value: I): String {
        return if (value !is Int) {
            val toproc = String.format("%.${configuration.formatCount}f", value)
            BigDecimal(toproc).stripTrailingZeros().toString()
        } else {
            value.toString()
        }
    }

    open class Configuration<I: Number>(
        open var min: I? = null,
        open var max: I? = null,
        var unit: String = "мг/сут",
        var formatCount: Int = 2
    ) {
        fun ranged(repr: DoseRange.Repr): DoseRange.RangeConfiguration<I> =
            DoseRange.RangeConfiguration<I>(repr).apply {
                this.max = this@Configuration.max
                this.min = this@Configuration.min
                this.unit = this@Configuration.unit
                this.formatCount = this@Configuration.formatCount
            }
    }
}

class DoseRange<I>(
    private var value: I,
    private var rangeValue: I,
    private val configuration: RangeConfiguration<I> = RangeConfiguration()
) : Dose<I>(value, configuration) where I: Number, I: Comparable<I> {

    enum class Repr { FROM_TO, HYPHEN }

    init {
        value = if (value > rangeValue) rangeValue else value
        configuration.min?.let {
            value = if (value < it) it else value
            rangeValue = if (rangeValue < it) it else rangeValue
        }
        configuration.max?.let {
            value = if (value > it) it else value
            rangeValue = if (rangeValue > it) it else rangeValue
        }
    }

    override fun toString(): String {
        if (value == rangeValue) {
            return "${formatValue(value)} ${configuration.unit}"
        }
        return when (configuration.repr) {
            Repr.FROM_TO -> {
                "от ${formatValue(value)} до ${formatValue(rangeValue)} ${configuration.unit}"
            }
            Repr.HYPHEN -> {
                "${formatValue(value)}-${formatValue(rangeValue)} ${configuration.unit}"
            }
        }
    }

    class RangeConfiguration<I: Number>(
        var repr: Repr = Repr.HYPHEN
    ): Configuration<I>()
}

class StringValue(private val value: String): DosePresenter {
    override fun toString(): String = value
}

/////////////////////////////////////////////////////////////////////

abstract class DoseArgumentBuilder {

    lateinit var argument: DoseArgument

    fun build() = argument

    abstract override fun toString(): String
}

abstract class NumericDoseArgumentBuilder<T, B>: DoseArgumentBuilder()
    where T: Number, T: Comparable<T>, B: NumericDoseArgumentBuilder<T, B> {

    protected abstract val builder: B

    protected var unit: String = "мл"
    protected var digitsAfterPoint: Int = 3
    protected var removeTrailingZeroes: Boolean = true
    protected var minValue: T? = null
    protected var maxValue: T? = null
    protected var useFraction: Boolean = false

    fun min(value: T): B =
        builder.also { this.minValue = value }

    fun max(value: T): B =
        builder.apply { maxValue = value }

    fun unit(value: String): B =
        builder.apply { unit = value }

    fun fraction(): B =
        builder.apply { useFraction = true }

    fun formatFloat(digitsAfterPoint: Int = 3, removeTrailingZeroes: Boolean = true): B =
        builder.apply {
            this.digitsAfterPoint = digitsAfterPoint
            this.removeTrailingZeroes = removeTrailingZeroes
        }

    protected fun buildValue(value: T): String {
        var max = maxValue
        var min = minValue
        if (max != null && min != null && max < min) {
            min = maxValue
            max = minValue
        }
        var processedValue = value
        processedValue = if (min == null || processedValue > min) processedValue else min
        processedValue = if (max == null || processedValue < max) processedValue else max
        return if (processedValue is Float || processedValue is Double) {
            if (useFraction) {
                formatStringForFraction(processedValue)
            } else {
                formatStringForFloatingPoint(processedValue)
            }
        } else {
            processedValue.toString()
        }
    }

    private fun <I> formatStringForFloatingPoint(processedValue: I) : String where I: Number, I: Comparable<I> {
        return String.format("%.${digitsAfterPoint}f", processedValue).run {
            if (removeTrailingZeroes &&
                this.toCharArray().indexOf('.') + this.toCharArray().indexOf(',') > -2 ) {
                this.trimEnd { it == '0' }.trimEnd { it == '.' }.trimEnd { it == ',' }
            } else {
                this
            }
        }
    }

    private fun <I> formatStringForFraction(processedValue: I): String where I: Number, I: Comparable<I> {
        val formattedValue = formatStringForFloatingPoint(processedValue)
        if (!formattedValue.contains(","))
            return processedValue.toInt().toString()
        val (int, frac) = formattedValue.let {
            val split = it.split(",")
            Pair(split[0], split[1])
        }
        var numerator = frac.toInt()
        var denominator = 10.0.pow(frac.length.toDouble()).toInt()
        val gcd = gcd(numerator, denominator)
        numerator /= gcd
        denominator /= gcd
        return if (int != "0") {
            "$int $numerator/$denominator"
        } else {
            "$numerator/$denominator"
        }
    }

    private fun gcd(a: Int, b: Int): Int {
        var la = a
        var lb = b
        while (la != lb) {
            if (la % lb == 0) return lb
            if (lb % la == 0) return la
            if (la > lb) la -= lb
            else lb -= la
        }
        return la
    }

}

class SingleDoseArgumentBuilder<I>(val baseValue: I) :
    NumericDoseArgumentBuilder<I, SingleDoseArgumentBuilder<I>>()
    where I: Number, I: Comparable<I> {

    override val builder: SingleDoseArgumentBuilder<I> = this

    override fun toString(): String = "${builder.buildValue(baseValue)} ${builder.unit}"
}

class RangedDoseArgumentBuilder<I>(
    val baseValue: I,
    val rangingValue: I?
) : NumericDoseArgumentBuilder<I, RangedDoseArgumentBuilder<I>>()
    where I: Number, I: Comparable<I> {

    enum class SplitType {
        HYPHEN, FROM_TO
    }

    override val builder: RangedDoseArgumentBuilder<I> = this

    private var splitType: SplitType = SplitType.HYPHEN

    fun splitter(type: SplitType): RangedDoseArgumentBuilder<I> =
        this.apply { this.splitType = type }

    override fun toString(): String {
        var first = builder.buildValue(baseValue)
        var second = rangingValue?.let {
            builder.buildValue(rangingValue)
        }
        if (second != null && rangingValue != null && baseValue > rangingValue) {
            val temp = first
            first = second
            second = temp
        }
        return if (second != null && first != second) {
            when(splitType) {
                SplitType.HYPHEN ->
                    "$first-$second ${builder.unit}"
                SplitType.FROM_TO ->
                    "от $first до $second ${builder.unit}"
            }
        } else {
            "$first ${builder.unit}"
        }
    }
}

class StringArgumentBuilder(private val stringValue: String) : DoseArgumentBuilder() {
    override fun toString(): String = stringValue.trim()
}

class DoseArgument private constructor(private val doseArgumentBuilder: DoseArgumentBuilder){

    override fun toString() = doseArgumentBuilder.toString()

    companion object {
        fun <I> of(baseValue: I) : SingleDoseArgumentBuilder<I> where I: Number, I: Comparable<I> =
            initBuilder(SingleDoseArgumentBuilder(baseValue))

        fun <I> of(baseValue: I, rangingValue: I?) : RangedDoseArgumentBuilder<I> where
            I: Number, I: Comparable<I> =
            initBuilder(RangedDoseArgumentBuilder(baseValue, rangingValue))

        fun of(baseString: String) : StringArgumentBuilder =
            initBuilder(StringArgumentBuilder(baseString))

        private fun <T: DoseArgumentBuilder> initBuilder(builder: T): T {
            DoseArgument(builder).apply { builder.argument = this }
            return builder
        }
    }
}

