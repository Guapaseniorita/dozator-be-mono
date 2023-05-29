package io.dozator.dto.error

data class ErrorDetailsDto(
    var errorClass: String?,
    val message: String?
) {
    constructor(errorObject: Any?, message: String?) : this(errorObject?.javaClass?.simpleName, message)
}

