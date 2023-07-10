package io.dozator.domain

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.io.Serializable
import java.time.OffsetDateTime

@MappedSuperclass
abstract class AbstractEntity : Serializable {

    @Column(name = "created_ts", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    var created: OffsetDateTime = OffsetDateTime.now()

    @Column(name = "updated_ts", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    var updated: OffsetDateTime = OffsetDateTime.now()

}
