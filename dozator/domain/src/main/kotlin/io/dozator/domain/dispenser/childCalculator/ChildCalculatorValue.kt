package io.dozator.domain.dispenser.childCalculator

import io.dozator.domain.dispenser.Dispenser
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
const val NAME = "child_calculator_value"
@Document(NAME)
class ChildCalculatorValue: Dispenser(), ChildCalculatorValueDeclaration {
    @Field
    override var day: Int = 0
    @Field
    override var month: Int = 0
    @Field
    override val year: Int = 0
    @Field
    override val weight: Double = 0.0
    @Field
    override val height: Double = 0.0
    @Field
    override val headCirc: Double = 0.0
    @Field
    override val boy: Boolean = true
}
