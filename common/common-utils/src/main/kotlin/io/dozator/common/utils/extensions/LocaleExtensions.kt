package io.dozator.common.utils.extensions

import org.apache.commons.lang3.LocaleUtils
import io.dozator.common.utils.exceptions.CommonException
import java.util.*

fun Locale.isAvailableOrNull() = if (LocaleUtils.isAvailableLocale(this)) this else null
fun Locale.isAvailableOrThrow() = if (LocaleUtils.isAvailableLocale(this)) this else
    throw CommonException.InvalidArgument("Locale with tag [${this.toLanguageTag()}] not available")

fun String.parseAsLocale(): Locale {
    try {
        return LocaleUtils.toLocale(this)
    } catch (ignored: IllegalArgumentException) {
        throw CommonException.InvalidArgument("Invalid locale format [$this]")
    }
}

fun String.asAvailableLocaleOrThrow(): Locale {
    return parseAsLocale().isAvailableOrThrow()
}

fun String.asAvailableLocaleOrNull(): Locale? {
    return parseAsLocale().isAvailableOrNull()
}
