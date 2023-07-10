package io.dozator.controller.api

import io.dozator.dto.request.CalculateDoseRequest
import io.dozator.dto.response.DoseResult
import io.dozator.service.DispenserFactory
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(path = [DOSE_ENDPOINT], produces = [API_VERSION_1])
@RestController
class DoseController(
    private val dispenserFactory: DispenserFactory,
) {

    @PostMapping(CALC_ENDPOINT)
    fun calc(@Valid @RequestBody request: CalculateDoseRequest): DoseResult {
        return dispenserFactory.saveAndCalc(request)
    }

}
