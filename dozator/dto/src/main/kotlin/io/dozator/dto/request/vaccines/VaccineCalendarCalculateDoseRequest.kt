package io.dozator.dto.request.vaccines

import com.fasterxml.jackson.annotation.JsonSubTypes
import io.dozator.domain.dispenser.DispenserType
import io.dozator.domain.dispenser.vaccines.VaccineCalendarDeclaration
import io.dozator.dto.request.CalculateDoseRequest
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping
import io.swagger.v3.oas.annotations.media.Schema

@JsonSubTypes(
    JsonSubTypes.Type(
        VaccineCalendarCalculateDoseRequest::class,
        name = DispenserType.Constants.VACCINE_CALENDAR),
)
@Schema(
    description = "VaccineCalendarCalculateDoseRequest",
    discriminatorProperty = "type",
    discriminatorMapping = [
        DiscriminatorMapping(schema = VaccineCalendarCalculateDoseRequest::class,
            value = DispenserType.Constants.VACCINE_CALENDAR),
    ],
)
abstract class AbstractVaccineCalendarCalculateDoseRequest: CalculateDoseRequest()

class VaccineCalendarCalculateDoseRequest(
    override val year: Int,
    override val month: Int,
    override val day: Int
) : AbstractVaccineCalendarCalculateDoseRequest(), VaccineCalendarDeclaration {
    override val type: DispenserType = DispenserType.VACCINE_CALENDAR
}