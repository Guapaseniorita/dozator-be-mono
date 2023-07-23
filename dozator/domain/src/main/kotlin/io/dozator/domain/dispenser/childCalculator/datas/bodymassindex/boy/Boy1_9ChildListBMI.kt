package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_9ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.9"

    init {
        list.add(ChildResult(14.8, 17.1))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.7, 14.7))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.6))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.2, 18.7))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.8, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

