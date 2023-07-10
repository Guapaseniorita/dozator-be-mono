package io.dozator.domain.dispenser

import jakarta.persistence.Id
import org.springframework.data.mongodb.core.mapping.Field

abstract class Dispenser {

    @Id
    @Field("_id")
    var id: String? = null

    @Field("result")
    lateinit var result: DispenserResult
}
