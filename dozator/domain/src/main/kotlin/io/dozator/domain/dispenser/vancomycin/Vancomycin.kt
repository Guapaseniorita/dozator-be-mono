package io.dozator.domain.dispenser.vancomycin

import io.dozator.domain.dispenser.Dispenser
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

const val NAME = "vancomycin"

@Document(NAME)
abstract class Vancomycin: Dispenser(), VancomycinDeclaration {

    @Field("indication")
    override lateinit var indication: Indication

    @Field("kidney_dysfunctions_gfr")
    override var kidneyDysfunctionsGFR: Int? = null

    @Field("anuria")
    override var anuria: Boolean = false

    @Field("contraindications")
    override var contraindications: Boolean = false
}