package io.dozator.domain.dispenser.childCalculator.result

import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultFactory
import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultType
import io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.girl.GirlBMIReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl.GirlHeadCircReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.height.girl.GirlHeightReferenceData
import io.dozator.domain.dispenser.childCalculator.datas.optimal.weight.GirlZCriterion
import io.dozator.domain.dispenser.childCalculator.datas.weight.girl.GirlWeightReferenceData
import org.springframework.stereotype.Component

@Component
class GirlChildCalculatorResultFactory : ChildCalculatorResultFactory(){
    override val type: ChildCalculatorResultType = ChildCalculatorResultType.GIRL
    override fun getMessage(weight: Double, bmi: Double, height: Double, headCirc: Double, age: String) : String {
        val wGirl = GirlWeightReferenceData(weight)
        val zGirl = GirlZCriterion()
        val bmiGirl = GirlBMIReferenceData(bmi)
        val hGirl = GirlHeightReferenceData(height)
        val hcGirl = GirlHeadCircReferenceData(headCirc)
        return """
            ${wGirl.getMessage(age, weight)}
            ${zGirl.getZRate(age)}
            ${bmiGirl.getMessage(age, bmi)}
            ${hGirl.getMessage(age, height)}
            ${hcGirl.getMessage(age, headCirc)}
        """.trimIndent()
    }
}