package io.dozator.common.utils.extensions

import org.awaitility.core.ConditionFactory
import org.awaitility.core.ConditionTimeoutException
import org.awaitility.kotlin.untilNotNull

internal fun <T> ConditionFactory.untilNotNull(timeoutMessage: String, fn: () -> T?): T = try {
    untilNotNull(fn)
} catch (e: ConditionTimeoutException) {
    throw ConditionTimeoutException(timeoutMessage, e)
}

internal fun <T> ConditionFactory.untilNotEmpty(timeoutMessage: String, fn: () -> List<T>): List<T> = try {
    untilNotNull { fn().takeIf { it.isNotEmpty() }}
} catch (e: ConditionTimeoutException) {
    throw ConditionTimeoutException(timeoutMessage, e)
}

public fun ConditionFactory.until(timeoutMessage: String, predicate: () -> Boolean) = try {
    until(predicate)
} catch (e: ConditionTimeoutException) {
    throw ConditionTimeoutException(timeoutMessage, e)
}

