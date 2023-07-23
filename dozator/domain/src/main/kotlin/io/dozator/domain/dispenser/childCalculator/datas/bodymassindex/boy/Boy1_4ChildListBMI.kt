package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_4ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.4"

    init {
        list.add(ChildResult(15.2, 17.6))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.0, 15.1))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.9))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.7, 19.3))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.4, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

