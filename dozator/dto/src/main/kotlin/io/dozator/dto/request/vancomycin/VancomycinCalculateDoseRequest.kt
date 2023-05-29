package io.dozator.dto.request.vancomycin

import com.fasterxml.jackson.annotation.JsonSubTypes
import io.dozator.domain.dispenser.DispenserType
import io.dozator.domain.dispenser.vancomycin.Indication
import io.dozator.domain.dispenser.vancomycin.VancomycinAdultDeclaration
import io.dozator.domain.dispenser.vancomycin.VancomycinChildDeclaration
import io.dozator.domain.dispenser.vancomycin.VancomycinDeclaration
import io.dozator.dto.request.CalculateDoseRequest
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping
import io.swagger.v3.oas.annotations.media.Schema

@JsonSubTypes(
    JsonSubTypes.Type(
        VancomycinAdultCalculateDoseRequest::class,
        name = DispenserType.Constants.VANCOMYCIN_ADULT_VALUE),
    JsonSubTypes.Type(
        VancomycinChildCalculateDoseRequest::class,
        name = DispenserType.Constants.VANCOMYCIN_CHILD_VALUE),
)
@Schema(
    description = "VancomycinCalculateDoseRequest",
    discriminatorProperty = "type",
    discriminatorMapping = [
        DiscriminatorMapping(
            schema = VancomycinAdultCalculateDoseRequest::class,
            value = DispenserType.Constants.VANCOMYCIN_ADULT_VALUE),
        DiscriminatorMapping(
            schema = VancomycinChildCalculateDoseRequest::class,
            value = DispenserType.Constants.VANCOMYCIN_CHILD_VALUE),
    ],
)
abstract class VancomycinCalculateDoseRequest: CalculateDoseRequest(), VancomycinDeclaration

class VancomycinAdultCalculateDoseRequest(
    override val indication: Indication,
    override val kidneyDysfunctionsGFR: Int?,
    override val anuria: Boolean,
    override val contraindications: Boolean,
) : VancomycinCalculateDoseRequest(), VancomycinAdultDeclaration {
    override val type: DispenserType = DispenserType.VANCOMYCIN_ADULT
}

class VancomycinChildCalculateDoseRequest(
    override val indication: Indication,
    override val kidneyDysfunctionsGFR: Int?,
    override val anuria: Boolean,
    override val weight: Float,
    override val contraindications: Boolean
) : VancomycinCalculateDoseRequest(), VancomycinChildDeclaration {
    override val type: DispenserType = DispenserType.VANCOMYCIN_CHILD
}