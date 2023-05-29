package io.dozator.common.utils.time

import java.time.LocalDateTime
import java.time.ZoneId

fun nowEpoch(now: LocalDateTime? = null): Long {
    return (now ?: LocalDateTime.now()).atZone(ZoneId.systemDefault()).toEpochSecond()
}

fun weekAgoEpoch(now: LocalDateTime? = null): Long {
    return (now ?: LocalDateTime.now()).minusWeeks(1).atZone(ZoneId.systemDefault()).toEpochSecond()
}