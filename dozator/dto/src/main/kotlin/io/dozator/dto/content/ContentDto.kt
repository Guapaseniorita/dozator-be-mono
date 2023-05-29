package io.dozator.dto.content

import com.fasterxml.jackson.databind.JsonNode

data class ContentDto(
    val id: String,
    val data: JsonNode,
)