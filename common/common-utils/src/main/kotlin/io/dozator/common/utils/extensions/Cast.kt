package io.dozator.common.utils.extensions

fun <T> Any.cast(): T = this as T

inline fun <reified T> Any.safeCast(): T? = this as? T
