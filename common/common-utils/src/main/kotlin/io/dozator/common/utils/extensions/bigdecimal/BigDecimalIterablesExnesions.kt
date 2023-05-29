package io.dozator.common.utils.extensions.bigdecimal

import java.math.BigDecimal

// Iterables

fun Iterable<BigDecimal>.sum(): BigDecimal {
    return this.fold(BigDecimal.ZERO) { sum, element -> sum + element }
}

fun Iterable<BigDecimal>.sumOrNull(): BigDecimal? {
    val sum = this.sum()
    return if (sum.isZero()) return null else sum
}

fun Array<out BigDecimal>.sum(): BigDecimal {
    return this.fold(BigDecimal.ZERO) { sum, element -> sum + element }
}

fun <T> Iterable<T>.sumBy(getElement: (T) -> BigDecimal): BigDecimal {
    return this.fold(0.toBigDecimal()) { sum, element -> sum + getElement(element) }
}

fun <T> Iterable<T>.averageBy(getElement: (T) -> BigDecimal): BigDecimal {
    return if (count() == 0) BigDecimal.ZERO else sumBy(getElement) / count()
}

fun <T> Iterable<T>.weightedAverageBy(getPrice: (T) -> BigDecimal, getAmount: (T) -> BigDecimal): BigDecimal {
    val amountSum = sumBy { getAmount(it) }
    return if (count() == 0 || amountSum.isZero())
        BigDecimal.ZERO
    else
        sumBy { getPrice(it) * getAmount(it) } / amountSum
}
