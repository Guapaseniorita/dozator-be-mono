package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.3"

    init {
        list.add(ChildResult(85.0, 91.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.5, 84.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 81.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(91.7, 95.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

