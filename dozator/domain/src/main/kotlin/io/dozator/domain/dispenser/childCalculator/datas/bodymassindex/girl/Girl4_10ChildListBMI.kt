package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_10ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "4.10"

    init {
        list.add(ChildResult(14.0, 16.8))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(12.7, 13.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 12.6))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.9, 18.8))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.9, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}




