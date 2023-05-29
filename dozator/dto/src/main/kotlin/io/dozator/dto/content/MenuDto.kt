package io.dozator.dto.content

import com.fasterxml.jackson.databind.JsonNode

data class MenuDto(
    val id: String,
    val category: String,
    val title: String,
    val subtitle: String,
    val active: Boolean,
    val literature: JsonNode?
)