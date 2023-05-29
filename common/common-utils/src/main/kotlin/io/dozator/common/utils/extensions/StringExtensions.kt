package io.dozator.common.utils.extensions

import org.apache.commons.lang3.StringUtils
import java.net.URLDecoder

private const val ELLIPSIS = "..."

fun String.ellipsize(maxCharacters: Int = 100): String =
    StringUtils.abbreviate(this, ELLIPSIS, maxCharacters)

fun String.decode(enc: String = "UTF-8"): String = URLDecoder.decode(this, enc)

fun String.remove(str: String) = replace(str, "")


