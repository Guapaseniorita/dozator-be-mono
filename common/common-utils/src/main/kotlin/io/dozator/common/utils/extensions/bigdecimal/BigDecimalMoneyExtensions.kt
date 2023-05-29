package io.dozator.common.utils.extensions.bigdecimal

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

// Money formatting

private val decimalFormatSymbols = DecimalFormatSymbols().apply {
    decimalSeparator = '.'
    groupingSeparator = ' '
}

const val CASH_DECIMAL_PLACES = 0
const val CRYPTO_DECIMAL_PLACES = 3

private const val MONEY_PATTERN = "#,##0.00"

fun Number.formatAsMoney(maximumFractionDigits: Int = 8): String = DecimalFormat(MONEY_PATTERN, decimalFormatSymbols).apply {
    this.minimumFractionDigits = 0
    this.maximumFractionDigits = maximumFractionDigits
}.format(asBigDecimal())

fun Number.formatAsCashCurrency() = formatAsMoney(CASH_DECIMAL_PLACES)
fun Number.formatAsCryptoCurrency() = formatAsMoney(CRYPTO_DECIMAL_PLACES)

fun BigDecimal.toScaleCash(): BigDecimal? {
    return this.setScale(2, RoundingMode.HALF_EVEN)
}
