package io.dozator.common.utils.extensions.bigdecimal

import java.math.BigDecimal
import java.math.RoundingMode

val DELTA = BigDecimal.valueOf(0.0001)
const val HIGH_PRECISION_SCALE = 50
const val SCALE = 8

// Arithmetic
operator fun BigDecimal.div(other: Number): BigDecimal = divide(other.asBigDecimal(), RoundingMode.HALF_EVEN)
operator fun BigDecimal.times(other: Number): BigDecimal = multiply(other.asBigDecimal())

infix fun BigDecimal.divOrZero(divisor: BigDecimal): BigDecimal {
    if (divisor.isZero()) return BigDecimal.ZERO
    return this / divisor
}

fun BigDecimal.multiplyWithHighPrecision(another: BigDecimal): BigDecimal {
    return this.setHighPrecisionScale().multiply(another.setHighPrecisionScale())
}

fun BigDecimal.multiplyBy(another: BigDecimal, resultScale: Int = SCALE): BigDecimal {
    return this.toScaleFloor().multiply(another.toScaleFloor()).toScaleFloor(resultScale)
}

fun BigDecimal.divideBy(another: BigDecimal, resultScale: Int = SCALE): BigDecimal {
    return this.toScaleFloor().divide(another.toScaleEven(), RoundingMode.HALF_EVEN).toScaleFloor(resultScale)
}

fun BigDecimal.divideWithHighPrecision(another: BigDecimal): BigDecimal {
    return this.setHighPrecisionScale().divide(another.setHighPrecisionScale(), RoundingMode.HALF_EVEN)
}

fun BigDecimal.divideOneWithHighPrecision(): BigDecimal {
    return BigDecimal.ONE.setHighPrecisionScale().divideWithHighPrecision(this)
}

fun BigDecimal.appendPercent(percent: BigDecimal, resultScale: Int = SCALE): BigDecimal {
    if (percent < (-100).asBigDecimal() || percent > 100.asBigDecimal()) {
        throw IllegalArgumentException("Percent should be within [-100; 100]")
    }
    val multiplier = (100.asBigDecimal() + percent).divideBy(100.asBigDecimal())
    return this.multiplyBy(multiplier, resultScale)
}


// Comparison

fun BigDecimal.isZero(): Boolean {
    return this.isEqual(BigDecimal.ZERO)
}

fun BigDecimal.isNotZero(): Boolean {
    return !this.isZero()
}

fun BigDecimal?.orZero(): BigDecimal {
    return this ?: BigDecimal.ZERO
}

fun BigDecimal.toZeroOrPositive(): BigDecimal {
    return if (this.lessThan(BigDecimal.ZERO)) BigDecimal.ZERO else this
}

fun BigDecimal?.isEqual(another: BigDecimal?): Boolean {
    if (this == null) return another == null
    return if (another != null) this.compareTo(another) == 0 else false
}

fun BigDecimal.isApproxEqual(another: BigDecimal): Boolean {
    return this.subtract(another).abs().lessThan(DELTA)
}

fun BigDecimal.isEqualWithScale(another: BigDecimal): Boolean {
    return this.toScaleFloor().isEqual(another.toScaleFloor())
}

fun BigDecimal?.isNotEqual(another: BigDecimal?): Boolean {
    return !this.isEqual(another)
}

fun BigDecimal.greaterThan(another: BigDecimal): Boolean {
    return this > another
}

fun BigDecimal.greaterThanOrEquals(another: BigDecimal): Boolean {
    return this >= another
}

fun BigDecimal.lessThan(another: BigDecimal): Boolean {
    return this < another
}

infix fun BigDecimal?.maxWith(another: BigDecimal) : BigDecimal {
    if (this == null) return another

    return this.max(another)
}

infix fun BigDecimal?.minWith(another: BigDecimal) : BigDecimal {
    if (this == null) return another

    return this.min(another)
}

// Scale

fun BigDecimal.toScaleEven(): BigDecimal {
    return this.toScaleEven(SCALE)
}

fun BigDecimal.toScaleEven(scale: Int): BigDecimal {
    return this.toScale(RoundingMode.HALF_EVEN, scale)
}

fun BigDecimal.toScale(roundingMode: RoundingMode, scale: Int = SCALE): BigDecimal {
    return this.setScale(scale, roundingMode)
}

fun BigDecimal.toScaleFloor(scale: Int = SCALE): BigDecimal {
    return this.toScale(RoundingMode.FLOOR, scale)
}

fun BigDecimal.toScaleDown(scale: Int = SCALE): BigDecimal {
    return this.toScale(RoundingMode.DOWN, scale)
}

// Util

fun BigDecimal.share(total: BigDecimal): BigDecimal {
    if (isZero()) return BigDecimal.ZERO
    return this.divideWithHighPrecision(total)
}

fun List<BigDecimal>.averageOrNull(): BigDecimal? {
    if (isEmpty()) return null
    return sum() / size
}

fun BigDecimal.findPercent(piece: BigDecimal): BigDecimal {
    return piece.divideBy(this).multiplyBy(BigDecimal.valueOf(100))
}

private fun BigDecimal.setHighPrecisionScale(): BigDecimal {
    return this.setScale(HIGH_PRECISION_SCALE, RoundingMode.HALF_EVEN)
}

