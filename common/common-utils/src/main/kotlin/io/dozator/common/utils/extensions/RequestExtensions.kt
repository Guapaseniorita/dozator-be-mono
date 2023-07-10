package io.dozator.common.utils.extensions

import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.context.request.ServletWebRequest
import org.springframework.web.context.request.WebRequest

val WebRequest.url get(): String = (this as ServletWebRequest).request.url

val HttpServletRequest.url
    get(): String = if (queryString.isNullOrBlank()) requestURI else "$requestURI?$queryString"

val WebRequest.method get(): String = (this as ServletWebRequest).request.method
