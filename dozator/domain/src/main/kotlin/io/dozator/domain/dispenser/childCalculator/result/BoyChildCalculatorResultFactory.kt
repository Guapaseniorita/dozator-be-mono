package io.dozator.domain.dispenser.childCalculator.result

import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultFactory
import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultType
import io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy.BoyBMIReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy.BoyHeadCircReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.height.boy.BoyHeightReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.optimal.weight.BoyZCriterion
import io.dozator.domain.dispenser.childCalculator.datas.weight.boy.BoyWeightReferenceData
import org.springframework.stereotype.Component

@Component
class BoyChildCalculatorResultFactory() : ChildCalculatorResultFactory() {
    override val type: ChildCalculatorResultType = ChildCalculatorResultType.BOY
    override fun getMessage(weight: Double, bmi: Double, height: Double, headCirc: Double, age: String) : String {
        val wBoy = BoyWeightReferenceData(weight)
        val zBoy = BoyZCriterion()
        val bmiBoy = BoyBMIReferenceData(bmi)
        val hBoy = BoyHeightReferenceData(height)
        val hcBoy = BoyHeadCircReferenceData(headCirc)
        return """
            ${wBoy.getMessage(age, weight)}
            ${zBoy.getZRate(age)}
            ${bmiBoy.getMessage(age, bmi)}
            ${hBoy.getMessage(age, height)}
            ${hcBoy.getMessage(age, headCirc)}
        """.trimIndent()
    }
}