package io.dozator.domain.dispenser.vaccines

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class VaccineCalendarResultFactoryProviderConfiguration(
    private val factories: List<VaccineCalendarResultFactory>
) {
    @Bean
    fun vaccineCalendarResultFactoryMap(): Map<VaccineCalendarResultType, VaccineCalendarResultFactory> =
        factories.associateBy { it.type }
}