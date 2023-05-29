package io.dozator.domain.dispenser

import org.springframework.data.mongodb.core.mapping.Field
import javax.persistence.Id

abstract class Dispenser {

    @Id
    @Field("_id")
    var id: String? = null

    @Field("result")
    lateinit var result: DispenserResult
}
