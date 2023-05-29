package io.dozator.common.utils.extensions

import java.time.Duration
import java.time.OffsetDateTime
import java.time.ZoneOffset

private val MIN_OFFSET_DATE_TIME = OffsetDateTime.of(2019, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)
private val MAX_OFFSET_DATE_TIME = OffsetDateTime.of(2030, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)

data class OffsetDateRange(
    val from: OffsetDateTime?,
    val to: OffsetDateTime?
) {
    override fun toString() = "[$from - $to]"
}

fun dateRange(from: OffsetDateTime? = null, to: OffsetDateTime? = null) =
    OffsetDateRange(from.orDefaultFrom(), to.orDefaultTo())

fun OffsetDateRange?.orDefault() = dateRange(this?.from, this?.to)

fun OffsetDateTime?.orDefaultFrom(): OffsetDateTime = this ?: MIN_OFFSET_DATE_TIME

fun OffsetDateTime?.orDefaultTo(): OffsetDateTime = this ?: MAX_OFFSET_DATE_TIME

fun OffsetDateRange.periods(step: Duration): List<OffsetDateRangePeriod> {
    require(step.isPositive) { "negative 'period' is not supported" }

    val fromChecked = from.orDefaultFrom()
    val toChecked = to.orDefaultTo()
    require(fromChecked <= toChecked) { "'from' time should be before 'to' time" }

    val diffFor200Steps = step.multipliedBy(200)
    val currentDiff = Duration.between(fromChecked, toChecked)
    require(diffFor200Steps > currentDiff) {
        "not allowed to request more than 200 period steps. try to request less date range or large period"
    }

    val results = mutableListOf<OffsetDateRangePeriod>()

    var currentFrom = fromChecked
    var currentTo = fromChecked + step
    while (currentFrom < toChecked) {
        results.add(OffsetDateRangePeriod(currentFrom, currentTo.minusNanos(1)))
        currentFrom = currentTo
        currentTo = currentFrom + step
    }

    return results
}

val Duration.isPositive get() = !isNegative

data class OffsetDateRangePeriod(
    val from: OffsetDateTime,
    val to: OffsetDateTime
) {
    fun contains(time: OffsetDateTime): Boolean {
        return time in from..to
    }
}

fun List<OffsetDateRangePeriod>.associatePeriods(dates: List<OffsetDateTime>): Map<OffsetDateTime, OffsetDateRangePeriod> {
    require(this.isNotEmpty()) { "periods are empty" }

    val sortedPeriods = this.sortedBy { it.from }
    val minPeriodDate = this.map { it.from }.minOrNull().orElseBackendBug()
    val maxPeriodDate = this.map { it.to }.maxOrNull().orElseBackendBug()

    val sortedDates = dates.filter { it in minPeriodDate..maxPeriodDate }.sorted()
    val sortedDatesIterator = sortedDates.iterator()

    val sortedPeriodsIterator = sortedPeriods.iterator()
    val results = mutableListOf<Pair<OffsetDateTime, OffsetDateRangePeriod>>()

    var period: OffsetDateRangePeriod = sortedPeriodsIterator.next()
    while (sortedDatesIterator.hasNext()) {
        val date = sortedDatesIterator.next()
        var foundPeriod = false
        if (period.contains(date)) {
            results.add(date to period)
            foundPeriod = true
        }

        while (sortedPeriodsIterator.hasNext() && !foundPeriod) {
            period = sortedPeriodsIterator.next()
            if (period.contains(date)) {
                results.add(date to period)
                foundPeriod = true
            }
        }
    }

    return results.associateBy({ it.first }, { it.second })
}
