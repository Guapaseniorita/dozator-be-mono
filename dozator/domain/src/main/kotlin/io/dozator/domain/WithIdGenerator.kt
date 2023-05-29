package io.dozator.domain

import java.util.*

interface WithIdGenerator : EntityClass {
    var id: String
}

fun generateId(): String {
    return UUID.randomUUID().toString()
}
