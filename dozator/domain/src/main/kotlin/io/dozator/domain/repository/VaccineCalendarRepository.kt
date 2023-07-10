package io.dozator.domain.repository

import io.dozator.domain.dispenser.vaccines.VaccineCalendar
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VaccineCalendarRepository: MongoRepository<VaccineCalendar, String>