package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_5ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "4.5"

    init {
        list.add(ChildResult(14.2, 16.5))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.0, 14.1))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 12.9))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.6, 18.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

