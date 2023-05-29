package io.dozator.dto.content

import com.fasterxml.jackson.databind.JsonNode

data class ContraindicationDto(
    val id: String,
    val title: String,
    val subtitle: String,
    val items: JsonNode
)