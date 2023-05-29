package io.dozator.common.utils.pagination

import org.springframework.data.domain.Sort

fun Sort.Direction?.toNumOrder(): Int {
    val direction = this ?: return 1
    return when (direction) {
        Sort.Direction.ASC -> 1
        Sort.Direction.DESC -> -1
    }
}
