package io.dozator.common.utils.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
class AuthException(message: String? = null, override val cause: Throwable? = null) : RuntimeException(message, cause)
