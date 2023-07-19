package io.dozator.domain.dispenser.childCalculator.result.child


import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultFactory
import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultType


abstract class ReferenceData : ChildCalculatorResultFactory() {
    protected var references: HashMap<String, ChildList>
    abstract override val type: ChildCalculatorResultType
    private var mes = ""
    private var fistFrase = ""
    private var secondFrase = ""
    private var thirdFrase = ""
    private var typeInd = ""
    private var unit = ""

    init {
        references = HashMap()
    }

    fun getMessage(age: String, weight: Double): String {
        val list = references[age]!!.list
        var message = ""
        for (i in list!!.indices) {
            val result = list[i]
            val range = result.range
            if (range!!.containsDouble(weight)) {
                message = result.message
            }
        }
        return message
    }
    fun setMes(age: String, weight: Double) {
        this.mes = getMessage(age, weight)
    }
    fun setFistFrase() {
        val array = mes.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        this.fistFrase = array[0]
    }
    fun setSecondFrase() {
        val array = mes.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        this.secondFrase = array[1]
    }
    fun setThirdFrase() {
        val array = mes.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        this.thirdFrase = array[2]
    }


    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description(fistFrase)
            .add(secondFrase)
            .add(thirdFrase)



}