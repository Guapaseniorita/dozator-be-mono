package io.dozator.controller.api.dispenser

import io.dozator.controller.api.*
import io.dozator.domain.dispenser.vancomycin.*
import io.dozator.domain.repository.*
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Transactional(readOnly = true)
@RequestMapping(path = [VANCOMYCIN], produces = [API_VERSION_1])
class VancomycinController(
    private val repo: VancomycinRepository<Vancomycin>,
    private val adultRepo: VancomycinAdultRepository,
    private val childRepo: VancomycinChildRepository,
) {

    @GetMapping(VANCOMYCIN_ALL)
    fun all(): List<Vancomycin> = repo.findAll()

    @GetMapping(VANCOMYCIN_ADULT)
    fun dtAdult(): List<VancomycinAdult> = adultRepo.findAll()

    @GetMapping(VANCOMYCIN_CHILD)
    fun dtChild(): List<VancomycinChild> = childRepo.findAll()
}