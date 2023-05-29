package io.dozator.common.utils.extensions

import java.time.*

val defaultZoneId: ZoneId = ZoneOffset.UTC

fun LocalDate.startOfDayOffset(zoneOffset: ZoneOffset = ZoneOffset.UTC): OffsetDateTime {
    return this.atStartOfDay().atOffset(zoneOffset)
}

fun LocalDate.endOfDayOffset(zoneOffset: ZoneOffset = ZoneOffset.UTC): OffsetDateTime {
    return this.plusDays(1).startOfDayOffset(zoneOffset).minusNanos(1)
}

fun LocalDate.startOfDayInstant(zoneOffset: ZoneOffset = ZoneOffset.UTC): Instant {
    return this.startOfDayOffset(zoneOffset).toInstant()
}

fun LocalDate.endOfDayInstant(zoneOffset: ZoneOffset = ZoneOffset.UTC): Instant {
    return this.plusDays(1).startOfDayOffset(zoneOffset).toInstant().minusNanos(1)
}

fun Instant.toLocalDate(zoneOffset: ZoneOffset = ZoneOffset.UTC): LocalDate {
    return this.atOffset(zoneOffset).toLocalDate()
}

fun LocalDate.atEndOfDay(): LocalDateTime = LocalDateTime.of(this, LocalTime.MIDNIGHT.minusNanos(1))

fun OffsetDateTime.startOfDay(): OffsetDateTime {
    return toLocalDate().atStartOfDay().atOffset(this.offset)
}

fun OffsetDateTime.endOfDay(): OffsetDateTime {
    return toLocalDate().atStartOfDay().plusDays(1).minusNanos(1).atOffset(this.offset)
}

fun Instant.trimToSecond(): Instant {
    return this.atOffset(ZoneOffset.UTC).withNano(0).toInstant()
}

fun Instant.trimToMinute(): Instant {
    return this.atOffset(ZoneOffset.UTC).withSecond(0).withNano(0).toInstant()
}

fun Instant.trimToHour(): Instant {
    return atOffset(ZoneOffset.UTC).withMinute(0).withSecond(0).withNano(0).toInstant()
}

fun OffsetDateTime.trimToHour(): OffsetDateTime {
    return withMinute(0).withSecond(0).withNano(0)
}

fun Instant.trimToDay(offset: ZoneOffset): Instant {
    return atOffset(offset).minusHours(0).withMinute(0).withSecond(0).withNano(0).toInstant()
}

fun OffsetDateTime.startOfYesterday() = minusDays(1L).startOfDay()

fun Instant.startOfYesterday(): Instant =
    OffsetDateTime.ofInstant(this, ZoneOffset.UTC).startOfYesterday().toInstant()

fun Instant?.orNow(): Instant = this ?: Instant.now()

fun Long.toInstant(): Instant {
    return Instant.ofEpochSecond(this)
}

fun min(a: OffsetDateTime, b: OffsetDateTime): OffsetDateTime = if (a < b) a else b

fun min(a: Instant, b: Instant): Instant = if (a < b) a else b

fun max(a: OffsetDateTime, b: OffsetDateTime): OffsetDateTime = if (a > b) a else b

fun max(a: Instant, b: Instant): Instant = if (a > b) a else b

fun Instant.toUtcOffset(): OffsetDateTime = atOffset(ZoneOffset.UTC)

fun String.toInstant(): Instant {
    return Instant.parse(this)
}
