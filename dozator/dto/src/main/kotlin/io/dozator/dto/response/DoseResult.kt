package io.dozator.dto.response

import io.dozator.domain.dispenser.DescriptionItem

data class DoseResult(
    val dose: String,
    val description: List<DescriptionItem>,
    val important: List<String>
)
