package io.dozator.domain.dispenser.childCalculator

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.DispenserResultFactory

abstract class ChildCalculatorResultFactory: DispenserResultFactory<ChildCalculatorResultType>() {
    protected var mesArray = Array<String>(13){""}
    abstract fun getMessage(weight: Double, bmi: Double, height: Double, headCirc: Double, age: String) : String
    override fun getDose(vararg doseArgument: DoseArgument): String = ""
    fun setMesArray(weight: Double, bmi: Double, height: Double, headCirc: Double, age: String) {
        getMessage(weight, bmi, height, headCirc, age).split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                .also { this.mesArray = it }
    }
    override fun getDescription(vararg doseArgument: DoseArgument): Description =
            Description(mesArray[0])
                    .add(mesArray[1])
                    .add(mesArray[2])
                    .add(mesArray[3])
                    .add(mesArray[4])
                    .add(mesArray[5])
                    .add(mesArray[6])
                    .add(mesArray[7])
                    .add(mesArray[8])
                    .add(mesArray[9])
                    .add(mesArray[10])
                    .add(mesArray[11])
                    .add(mesArray[12])
}
