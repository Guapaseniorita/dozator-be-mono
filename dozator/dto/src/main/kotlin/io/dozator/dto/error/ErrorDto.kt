package io.dozator.dto.error

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.dozator.common.utils.exceptions.CommonException
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

@JsonIgnoreProperties(ignoreUnknown = true)
data class ErrorDto(
    val status: Int = 0,
    val timestamp: String? = null,
    val errors: Set<ErrorDetailsDto> = mutableSetOf()
) {

    constructor(status: Int, msg: String? = null, exception: Any) : this(
        timestamp = Instant.now().format(),
        status = status,
        errors = setOf(ErrorDetailsDto(exception, msg))
    )

    constructor(
        status: Int,
        msg: String? = null,
        exception: Exception,
        errors: Set<ErrorDetailsDto>
    ) : this(
        timestamp = Instant.now().format(),
        status = status,
        errors = mutableSetOf(ErrorDetailsDto(exception, msg)).apply { addAll(errors) }
    )

    constructor(
        status: Int,
        errors: Set<ErrorDetailsDto>
    ) : this(
        timestamp = Instant.now().format(),
        status = status,
        errors = errors
    )

    constructor(
        status: Int,
        exceptionClass: KClass<out Exception>
    ) : this(
        timestamp = Instant.now().format(),
        status = status,
        errors = setOf(ErrorDetailsDto(exceptionClass.java.simpleName, ""))
    )


    companion object {
        fun internalError() = ErrorDto(
            500, // Internal Server Error
            CommonException.InternalError::class
        )
    }
}

private fun Instant.format() = Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME)

