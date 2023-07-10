package io.dozator.dto.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.dozator.domain.dispenser.DispenserType
import io.dozator.dto.request.vaccines.AbstractVaccineCalendarCalculateDoseRequest
import io.dozator.dto.request.vancomycin.VancomycinCalculateDoseRequest

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(VancomycinCalculateDoseRequest::class),
    JsonSubTypes.Type(AbstractVaccineCalendarCalculateDoseRequest::class)
)
abstract class CalculateDoseRequest {
    abstract val type: DispenserType
}
