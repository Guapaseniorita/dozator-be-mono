package io.dozator.domain.dispenser.childCalculator

import io.dozator.common.utils.extensions.orElseBackendBug
import org.springframework.stereotype.Service
@Service
class ChildCalculatorResultFactoryProvide(
    private val resultMap: Map<ChildCalculatorResultType, ChildCalculatorResultFactory>
) {
    fun getResultFactory(type: ChildCalculatorResultType): ChildCalculatorResultFactory =
        resultMap[type].orElseBackendBug()
}