package io.dozator.common.utils.exceptions

sealed class VerificationException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause) {
    class PendingExpired(message: String = "Pending operation was expired") : VerificationException(message)

    class PendingInvalid(message: String = "Invalid pending operation. Create new one") : VerificationException(message)
}
