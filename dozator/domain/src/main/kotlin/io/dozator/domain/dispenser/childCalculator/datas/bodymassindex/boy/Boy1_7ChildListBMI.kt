package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_7ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.7"

    init {
        list.add(ChildResult(15.0, 17.3))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.8, 14.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.7))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.4, 18.9))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.0, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

