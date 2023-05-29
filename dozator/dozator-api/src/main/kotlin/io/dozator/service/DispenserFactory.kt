package io.dozator.service

import io.dozator.common.utils.extensions.orElseThrowNotFound
import io.dozator.domain.dispenser.DispenserType
import io.dozator.dto.request.CalculateDoseRequest
import io.dozator.dto.response.DoseResult
import org.springframework.stereotype.Service

@Service
class DispenserFactory(
    private val dispenserMap: Map<DispenserType, DispenserProvider<CalculateDoseRequest>>
) {

    fun saveAndCalc(input: CalculateDoseRequest): DoseResult {
        val service = dispenserMap[input.type].orElseThrowNotFound()
        return service.saveAndCalc(input)
    }

}
