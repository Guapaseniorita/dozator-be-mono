package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_3ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "1.3"

    init {
        list.add(ChildResult(14.8, 17.4))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.5, 14.7))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.4))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.5, 19.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


