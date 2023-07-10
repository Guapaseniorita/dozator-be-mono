package io.dozator.domain.dispenser.vaccines

import io.dozator.common.utils.extensions.orElseBackendBug
import org.springframework.stereotype.Service

@Service
class VaccineCalendarResultFactoryProvider(
    private val resultMap: Map<VaccineCalendarResultType, VaccineCalendarResultFactory>
) {
    fun getResultFactory(type: VaccineCalendarResultType): VaccineCalendarResultFactory =
        resultMap[type].orElseBackendBug()
}