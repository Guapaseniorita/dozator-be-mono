package io.dozator.domain

import java.io.Serializable
import java.time.OffsetDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractEntity : Serializable {

    @Column(name = "created_ts", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    var created: OffsetDateTime = OffsetDateTime.now()

    @Column(name = "updated_ts", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    var updated: OffsetDateTime = OffsetDateTime.now()

}
