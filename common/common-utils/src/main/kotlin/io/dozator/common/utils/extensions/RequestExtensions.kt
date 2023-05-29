package io.dozator.common.utils.extensions

import org.springframework.web.context.request.ServletWebRequest
import org.springframework.web.context.request.WebRequest
import javax.servlet.http.HttpServletRequest

val WebRequest.url get(): String = (this as ServletWebRequest).request.url

val HttpServletRequest.url
    get(): String = if (queryString.isNullOrBlank()) requestURI else "$requestURI?$queryString"

val WebRequest.method get(): String = (this as ServletWebRequest).request.method
