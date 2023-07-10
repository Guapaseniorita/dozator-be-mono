package io.dozator.domain.dispenser

import io.dozator.domain.DoseArgument

abstract class DispenserResultFactory<T: Enum<*>> {

    abstract val type: T

    fun getDispenserResult(vararg doseArgument: DoseArgument): DispenserResult {
        return DefaultDispenserResult(
            type.name,
            getDose(*doseArgument),
            getDescription(*doseArgument).items
        )
    }

    protected abstract fun getDescription(vararg doseArgument: DoseArgument): Description

    protected abstract fun getDose(vararg doseArgument: DoseArgument): String
}