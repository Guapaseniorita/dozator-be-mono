package io.dozator.common.utils.extensions

import io.dozator.common.utils.exceptions.CommonException
import java.time.DateTimeException
import java.time.ZoneId
import java.time.zone.ZoneRulesException
import java.util.*

fun String.asAvailableZoneIdOrThrow(): ZoneId {
    try {
        return ZoneId.of(this)
    } catch (ignored: ZoneRulesException) {
        throw CommonException.InvalidArgument("Zone with name [${this}] not available")
    } catch (ignored: DateTimeException) {
        throw CommonException.InvalidArgument("Invalid zone format [$this]")
    }
}

fun ZoneId.toTimeZone(): TimeZone {
    return TimeZone.getTimeZone(this)
}

