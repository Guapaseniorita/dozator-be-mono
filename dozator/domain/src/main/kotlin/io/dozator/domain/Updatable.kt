package io.dozator.domain

import java.time.OffsetDateTime

interface Updatable {
    var updated: OffsetDateTime
}
