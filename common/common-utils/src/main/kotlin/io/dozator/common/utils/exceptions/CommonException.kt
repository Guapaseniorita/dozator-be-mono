package io.dozator.common.utils.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

sealed class CommonException(message: String?, cause: Throwable?, val messageOnly: Boolean = false) :
    RuntimeException(message, cause) {
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    class NotFound(message: String?, cause: Throwable? = null) : CommonException(message, cause, true)

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    class WrongRequest(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    class InvalidArgument(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "This is a bug on backend!")
    class BackendBug(message: String? = null, cause: Throwable? = null) : CommonException(message, cause) {
        constructor(obj: Any?) : this(obj?.toString(), null)
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Currency incorrect")
    class WrongCurrency(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    class InternalError(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(value = HttpStatus.CONFLICT)
    class AlreadyExists(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class IllegalOperation(message: String, cause: Throwable? = null) : CommonException(message, cause)

    @ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
    class NotImplemented(message: String? = null, cause: Throwable? = null) : CommonException(message, cause)


    companion object {
        inline fun <reified T : Any> NotFound(): NotFound {
            return NotFound(message = "Entity not found: ${T::class.simpleName}")
        }

        inline fun <reified T : Any> AlreadyExists(): AlreadyExists {
            return AlreadyExists(message = "Entity already exists: ${T::class.simpleName}")
        }
    }
}
