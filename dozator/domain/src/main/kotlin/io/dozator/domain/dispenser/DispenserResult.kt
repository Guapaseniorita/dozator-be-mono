package io.dozator.domain.dispenser

import io.dozator.domain.DoseArgument
import io.dozator.domain.DosePresenter

interface DispenserResult {
    val name: String
    val dose: String
    val description: List<DescriptionItem>
    val important: List<String>
}

// todo: переделать
class DefaultDispenserResult(
    override val name: String,
    override val dose: String,
    override val description: List<DescriptionItem> = listOf(),
    override val important: List<String> = listOf()
) : DispenserResult

interface DispenserResultBuilder<E : Enum<E>> {
    fun by(type: E, vararg doses: DosePresenter): DispenserResult
}

interface DispenserResultSelector<E : Enum<E>> {
    fun by(type: E, vararg doses: DoseArgument): DispenserResult
}

interface CalculatedResult<T: DispenserResult> {
    fun result(name: String, dose: String? = null) : T
}

class Description(description: String, caption: String = "") {
    val items: MutableList<DescriptionItem> = mutableListOf()

    init {
        add(description, caption)
    }

    fun add(description: String, caption: String = "", important: Boolean = false) : Description {
        return this.also { this.items.add(DescriptionItem(description, caption, important)) }
    }
}

data class DescriptionItem(
    val description: String,
    val caption: String = "",
    val important: Boolean = false
)

// TODO: сделать нормально
fun String.asDescription(captions: List<String> = listOf()) : List<DescriptionItem> {
    val noEmptyStrings = this.split("\n").filter { it.isNotBlank() }.map { it.trim() }
    val filledCaptions = captions.ifEmpty { noEmptyStrings.map { "" } }
    val captionMerged = noEmptyStrings.zip(filledCaptions)
    return captionMerged.map { DescriptionItem(it.first, it.second) }
}
