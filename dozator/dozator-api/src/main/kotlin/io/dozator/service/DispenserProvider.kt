package io.dozator.service

import io.dozator.domain.dispenser.DescriptionItem
import io.dozator.domain.dispenser.DispenserResult
import io.dozator.domain.dispenser.DispenserType
import io.dozator.dto.request.CalculateDoseRequest
import io.dozator.dto.response.DoseResult

interface DispenserProvider<C : CalculateDoseRequest> {
    val type: DispenserType

    fun saveAndCalc(input: C): DoseResult

    fun result(dispenserResult: DispenserResult)
      = result(dispenserResult.dose, dispenserResult.description, dispenserResult.important)

    fun result(
        dose: String,
        description: List<DescriptionItem>,
        important: List<String> = listOf()
    ) = DoseResult(dose, description, important)

}
