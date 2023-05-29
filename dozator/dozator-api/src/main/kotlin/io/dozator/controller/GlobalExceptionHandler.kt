package io.dozator.controller

import com.fasterxml.jackson.module.kotlin.MissingKotlinParameterException
import io.dozator.common.utils.exceptions.CommonException
import io.dozator.common.utils.extensions.logger
import io.dozator.common.utils.extensions.method
import io.dozator.common.utils.extensions.url
import io.dozator.dto.error.ErrorDetailsDto
import io.dozator.dto.error.ErrorDto
import org.apache.catalina.connector.ClientAbortException
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.http.converter.HttpMessageNotWritableException
import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.context.request.WebRequest
import org.springframework.web.server.ResponseStatusException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(Exception::class)
    fun handleGenericException(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        val responseStatus = findResponseStatus(ex) ?: return handleInternalError(ex, request)
        val reason = responseStatus.reason.ifEmpty { ex.message }
        logException(ex, request)
        return super.handleExceptionInternal(
            ex,
            ErrorDto(responseStatus.value.value(), reason, ex),
            HttpHeaders.EMPTY,
            responseStatus.value,
            request
        )
    }

    protected fun handleInternalError(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        logInternalError(ex)
        return super.handleExceptionInternal(
            ex,
            ErrorDto.internalError(),
            HttpHeaders.EMPTY,
            HttpStatus.INTERNAL_SERVER_ERROR,
            request
        )
    }

    @ExceptionHandler(ResponseStatusException::class)
    protected fun handleResponseStatusException(
        ex: ResponseStatusException,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val error = ErrorDto(
            status = ex.status.value(),
            msg = ex.reason,
            exception = ex
        )
        logException(ex, request)
        return super.handleExceptionInternal(ex, error, HttpHeaders.EMPTY, ex.status, request)
    }

    @ExceptionHandler(ClientAbortException::class)
    protected fun handleBrokenPipeException(
        ex: ClientAbortException,
        request: WebRequest,
    ): ResponseEntity<Any> {
        log.warn("Broken pipe during request", ex)
        return super.handleExceptionInternal(
            ex,
            ErrorDto.internalError(),
            HttpHeaders.EMPTY,
            HttpStatus.INTERNAL_SERVER_ERROR,
            request
        )
    }

    override fun handleBindException(
        ex: BindException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val fieldError = ex.fieldError
        var error = ErrorDto(HttpStatus.BAD_REQUEST.value(), "parameters binding error", request)
        if (fieldError != null) {
            error = ErrorDto(
                HttpStatus.BAD_REQUEST.value(),
                "'" + fieldError.field + "' wrong value: " + fieldError.rejectedValue,
                ex
            )
        }
        logException(ex, request)
        return super.handleExceptionInternal(ex, error, HttpHeaders.EMPTY, HttpStatus.BAD_REQUEST, request)
    }

    override fun handleMethodArgumentNotValid(
        ex: MethodArgumentNotValidException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val errorMessage = ex.javaClass.simpleName + ": " + ex.message
        val allErrors = ex.bindingResult.allErrors

        val error = ErrorDto(
            status = HttpStatus.BAD_REQUEST.value(),
            msg = errorMessage,
            exception = ex,
            errors = allErrors
                .map { it.toString() }
                .map { ErrorDetailsDto(ex, it) }
                .toSet()
        )
        logException(ex, request)
        return super.handleExceptionInternal(ex, error, HttpHeaders.EMPTY, HttpStatus.BAD_REQUEST, request)
    }

    override fun handleHttpMessageNotReadable(
        ex: HttpMessageNotReadableException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val error = when (val cause = ex.cause) {
            is MissingKotlinParameterException -> {
                ErrorDto(
                    status = HttpStatus.BAD_REQUEST.value(),
                    msg = "Parameter '${cause.path.joinToString(".") { it.fieldName }}' must not be null",
                    exception = ex
                )
            }
            else -> ErrorDto(HttpStatus.BAD_REQUEST.value(), exception = ex)
        }
        logException(ex, request)
        return super.handleExceptionInternal(ex, error, HttpHeaders.EMPTY, HttpStatus.BAD_REQUEST, request)
    }

    override fun handleMissingServletRequestParameter(
        ex: MissingServletRequestParameterException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val errorMessage = ex.javaClass.simpleName + ": " + ex.message
        val error = ErrorDto(HttpStatus.BAD_REQUEST.value(), errorMessage, ex)
        logException(ex, request)
        return super.handleExceptionInternal(ex, error, HttpHeaders.EMPTY, HttpStatus.BAD_REQUEST, request)
    }

    override fun handleHttpMessageNotWritable(
        ex: HttpMessageNotWritableException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        logInternalError(ex)
        return super.handleHttpMessageNotWritable(ex, headers, status, request)
    }

    private fun logInternalError(ex: Exception) {
        log.error("Internal error", ex)
    }

    protected fun logException(ex: Exception, request: WebRequest) {
        val isBackendBug = ex is CommonException.BackendBug

        val message = "${request.method}: ${request.url}"

        if (isBackendBug) {
            log.error(message, ex)
            return
        }

        if (findResponseStatus(ex)?.value?.is4xxClientError == true) {
            printWarn(message, ex)
            return
        }

        printError(message, ex)
    }

    private fun printWarn(message: String, ex: Exception) {
        if (isMessageOnly(ex)) {
            log.warn(message, ex.message)
        } else {
            log.warn(message, ex)
        }
    }

    private fun printError(message: String, ex: Exception) {
        if (isMessageOnly(ex)) {
            log.error(message, ex.message)
        } else {
            log.error(message, ex)
        }
    }

    private fun isMessageOnly(ex: Exception) = ex is CommonException && ex.messageOnly

    fun findResponseStatus(ex: Exception): ResponseStatus? =
        ex.javaClass.annotations.filterIsInstance<ResponseStatus>().firstOrNull()


    companion object {
        private val log = logger()
    }
}
