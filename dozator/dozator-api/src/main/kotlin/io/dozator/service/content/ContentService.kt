package io.dozator.service.content

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.dozator.common.utils.extensions.logger
import io.dozator.common.utils.extensions.orElseThrowNotFound
import io.dozator.domain.content.Content
import io.dozator.domain.content.ContentRepository
import io.dozator.domain.content.ContentType
import io.dozator.dto.content.ContentDto
import io.dozator.dto.content.ContraindicationDto
import io.dozator.dto.content.MenuDto
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ContentService(
    private val repository: ContentRepository,
    private val resourceLoader: ResourceLoader,
    private val mapper: ObjectMapper
) {

    @Transactional
    @EventListener(ApplicationReadyEvent::class)
    fun onStart() {
        ContentType.values().forEach { checkIfExistOrInsert(it) }
    }

    @Transactional(readOnly = true)
    fun getMenuList(): List<MenuDto> {
        val content = repository.findByType(ContentType.MENU)
            .orElseThrowNotFound()

        return mapper.readValue(content.value)
    }

    @Transactional(readOnly = true)
    fun getContraindicationList(): List<ContraindicationDto> {
        val content = repository.findByType(ContentType.CONTRAINDICATION)
            .orElseThrowNotFound()

        return mapper.readValue(content.value)
    }

    fun getContraindication(page: String): ContraindicationDto? {
        return getContraindicationList().firstOrNull { it.id == page }
    }

    @Transactional(readOnly = true)
    fun getContentList(contentType: ContentType): List<ContentDto> {
        val content = repository.findByType(contentType)
            .orElseThrowNotFound()

        return mapper.readValue(content.value)
    }

    fun getContent(contentType: ContentType, page: String): ContentDto? {
        return getContentList(contentType).firstOrNull { it.id == page }
    }

    private fun checkIfExistOrInsert(contentType: ContentType) {
        this.logger().info("Recreating content for $contentType")

        this.repository.deleteByType(contentType)
        this.repository.flush()

        val resource = this.resourceLoader.getResource("classpath:init/${contentType.name.lowercase()}.json")
        val tree = this.mapper.readTree(resource.file)

        val content = Content().also {
            it.type = contentType
            it.value = this.mapper.writeValueAsString(tree)
        }

        this.repository.save(content)
    }

}