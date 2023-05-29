package io.dozator.common.utils.pagination

import org.springframework.data.domain.Page

data class PagedResponse<T>(val data: List<T>, val total: Int)

fun <T> Page<T>.toResponse(): PagedResponse<T> {
    return PagedResponse(this.content, this.totalElements.toInt())
}
