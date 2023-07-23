package io.dozator.domain.dispenser.childCalculator

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChildCalculatorResultFactoryProvideConfig(
    private val factories: List<ChildCalculatorResultFactory>
) {

    @Bean
    fun childCalculatorResultFactoryMap(): Map<ChildCalculatorResultType, ChildCalculatorResultFactory> =
        factories.associateBy { it.type }
}