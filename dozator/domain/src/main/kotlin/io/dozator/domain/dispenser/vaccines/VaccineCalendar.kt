package io.dozator.domain.dispenser.vaccines

import io.dozator.domain.dispenser.Dispenser
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

const val NAME = "vaccine-calendar"

@Document(NAME)
class VaccineCalendar : Dispenser(), VaccineCalendarDeclaration {
    @Field
    override var year: Int = 0
    @Field
    override var month: Int = 0
    @Field
    override var day: Int = 0
}