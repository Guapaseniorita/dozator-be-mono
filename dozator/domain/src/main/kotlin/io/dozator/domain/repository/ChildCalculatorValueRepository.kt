package io.dozator.domain.repository

import io.dozator.domain.dispenser.childCalculator.ChildCalculatorValue
import io.dozator.domain.dispenser.vaccines.VaccineCalendar
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChildCalculatorValueRepository: MongoRepository<ChildCalculatorValue, String> {
}