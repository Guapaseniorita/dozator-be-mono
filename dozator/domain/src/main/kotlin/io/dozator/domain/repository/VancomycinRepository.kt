package io.dozator.domain.repository

import io.dozator.domain.dispenser.vancomycin.Vancomycin
import io.dozator.domain.dispenser.vancomycin.VancomycinAdult
import io.dozator.domain.dispenser.vancomycin.VancomycinChild
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VancomycinRepository<T: Vancomycin>: MongoRepository<T, String>

@Repository
interface VancomycinChildRepository: VancomycinRepository<VancomycinChild>

@Repository
interface VancomycinAdultRepository: VancomycinRepository<VancomycinAdult>