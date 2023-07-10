package io.dozator.domain.dispenser.vaccines

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.DispenserResultFactory

abstract class VaccineCalendarResultFactory: DispenserResultFactory<VaccineCalendarResultType>() {
    override fun getDose(vararg doseArgument: DoseArgument): String = ""
}