package io.dozator.config

import io.dozator.domain.dispenser.DispenserType
import io.dozator.dto.request.CalculateDoseRequest
import io.dozator.service.DispenserProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DispenserConfig(
    private val dispensers: List<DispenserProvider<*>>
) {

    @Bean
    @Suppress("UNCHECKED_CAST")
    fun dispenserMap(): Map<DispenserType, DispenserProvider<CalculateDoseRequest>> {
        return dispensers.associateBy { it.type } as Map<DispenserType, DispenserProvider<CalculateDoseRequest>>
    }
}
