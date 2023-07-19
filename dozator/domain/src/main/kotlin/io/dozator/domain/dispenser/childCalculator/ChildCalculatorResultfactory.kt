package io.dozator.domain.dispenser.childCalculator

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.DispenserResultFactory

abstract class ChildCalculatorResultFactory: DispenserResultFactory<ChildCalculatorResultType>() {
    override fun getDose(vararg doseArgument: DoseArgument): String = ""
}