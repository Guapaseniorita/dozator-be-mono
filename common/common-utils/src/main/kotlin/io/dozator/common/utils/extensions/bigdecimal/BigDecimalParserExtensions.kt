package io.dozator.common.utils.extensions.bigdecimal

import java.math.BigDecimal

// Parsers

fun String.asBigDecimal(): BigDecimal {
    return BigDecimal(this).toScaleFloor()
}

fun toBigDecimal(number: Number): BigDecimal {
    return when (number) {
        is BigDecimal -> number
        is Int -> number.toBigDecimal()
        is Long -> number.toBigDecimal()
        is Double -> number.toBigDecimal()
        is Float -> number.toBigDecimal()
        else -> error("Wrong $number")
    }
}

fun Number.asBigDecimal(): BigDecimal {
    return when (this) {
        is BigDecimal -> this
        is Int -> toBigDecimal()
        is Long -> toBigDecimal()
        is Double -> toBigDecimal()
        is Float -> toBigDecimal()
        else -> error("Wrong $this")
    }
}
