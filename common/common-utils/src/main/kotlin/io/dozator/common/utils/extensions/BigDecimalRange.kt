package io.dozator.common.utils.extensions

import java.math.BigDecimal

data class BigDecimalRange(
    val from: BigDecimal?,
    val to: BigDecimal?
) {
    override fun toString() = "[$from - $to]"
}

fun bigDecimalRange(from: BigDecimal? = null, to: BigDecimal? = null) =
    BigDecimalRange(from ?: Double.MIN_VALUE.toBigDecimal(), to ?: Double.MAX_VALUE.toBigDecimal())

fun BigDecimalRange?.orDefault() = bigDecimalRange(this?.from, this?.to)
