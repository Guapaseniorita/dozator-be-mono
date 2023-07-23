package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_7ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "3.7"

    init {
        list.add(ChildResult(14.3, 16.6))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.2, 14.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.1))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.7, 18.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

