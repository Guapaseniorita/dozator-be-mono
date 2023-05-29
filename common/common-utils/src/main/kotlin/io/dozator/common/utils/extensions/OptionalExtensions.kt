package io.dozator.common.utils.extensions

import io.dozator.common.utils.exceptions.CommonException
import java.util.*

fun <T> Optional<T>.unwrap(): T? = orElse(null)

inline fun <reified T : Any> Optional<T>.orElseThrowNotFound(): T = OptionalExtension.orElseThrowNotFound(this)
inline fun <reified T : Any> T?.orElseThrowNotFound(): T = this ?: throw CommonException.NotFound<T>()
inline fun <reified T : Any> T?.orElseBackendBug(): T = this ?: throw CommonException.BackendBug()
inline fun <reified T : Any> T?.orElseBackendBug(lazyMessage: () -> String): T =
    this ?: throw CommonException.BackendBug(message = lazyMessage())

inline fun <reified T : Any> T?.orElseThrowRequired(fieldName: () -> String): T =
    this ?: throw CommonException.InvalidArgument(message = "Field '${fieldName()}' is required")

inline fun <reified T : Any> T?.orElseThrowNotFound(lazyMessage: () -> String): T =
    this ?: throw CommonException.NotFound(message = lazyMessage())

inline fun <reified T : Any> Optional<T>.orElseThrowNotFound(lazyMessage: () -> String): T =
    unwrap().orElseThrowNotFound(lazyMessage)


object OptionalExtension {
    inline fun <reified T : Any> orElseThrowNotFound(o: Optional<T>): T {
        return when {
            o.isPresent -> o.get()
            else -> throw CommonException.NotFound<T>()
        }
    }
}

