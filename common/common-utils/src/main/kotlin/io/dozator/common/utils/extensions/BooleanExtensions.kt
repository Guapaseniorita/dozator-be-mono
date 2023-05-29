package io.dozator.common.utils.extensions

fun Boolean?.orTrue() = this ?: true

fun Boolean?.orFalse() = this ?: false

inline fun Boolean?.ifTrue(body: () -> Unit): Boolean = this?.let {
    if (it) body()
    it
} ?: false
