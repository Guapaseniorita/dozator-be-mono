package io.dozator.controller.api

import io.dozator.common.utils.extensions.orElseThrowNotFound
import io.dozator.domain.content.ContentType
import io.dozator.dto.content.MenuDto
import io.dozator.dto.content.ContentDto
import io.dozator.dto.content.ContraindicationDto
import io.dozator.service.content.ContentService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(path = [CONTENT_ENDPOINT], produces = [API_VERSION_1])
@RestController
@CrossOrigin(origins = [
    "https://iframe.gerogap.ru/",
    "https://gerogap.ru/"])
class ContentController(
    private val service: ContentService
) {

    @GetMapping(MENU_ENDPOINT)
    fun menu(): List<MenuDto> {
        return service.getMenuList()
    }

    @GetMapping(PAGE_ENDPOINT)
    fun pages(): List<ContentDto> {
        return service.getContentList(ContentType.PAGE)
    }

    @GetMapping("$PAGE_ENDPOINT/{id}")
    fun page(@PathVariable("id") page: String): ContentDto {
        return service.getContent(ContentType.PAGE, page)
            .orElseThrowNotFound()
    }

    @GetMapping(MODAL_ENDPOINT)
    fun modals(): List<ContentDto> {
        return service.getContentList(ContentType.MODAL)
    }

    @GetMapping("$MODAL_ENDPOINT/{id}")
    fun modal(@PathVariable("id") page: String): ContentDto {
        return service.getContent(ContentType.MODAL, page)
            .orElseThrowNotFound()
    }

    @GetMapping(CONTRAINDICATION_ENDPOINT)
    fun contraindications(): List<ContraindicationDto> {
        return service.getContraindicationList()
    }

    @GetMapping("$CONTRAINDICATION_ENDPOINT/{id}")
    fun contraindication(@PathVariable("id") page: String): ContraindicationDto {
        return service.getContraindication(page)
            .orElseThrowNotFound()
    }

}