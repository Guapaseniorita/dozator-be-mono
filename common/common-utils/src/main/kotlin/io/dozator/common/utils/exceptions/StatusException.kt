package io.dozator.common.utils.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

sealed class StatusException(message: String?, cause: Throwable?, val messageOnly: Boolean = false) :
    RuntimeException(message, cause) {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    class WrongTransition(message: String, cause: Throwable? = null) : StatusException(message, cause, true)

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    class WrongStatus(message: String, cause: Throwable? = null) : StatusException(message, cause, true)
}

