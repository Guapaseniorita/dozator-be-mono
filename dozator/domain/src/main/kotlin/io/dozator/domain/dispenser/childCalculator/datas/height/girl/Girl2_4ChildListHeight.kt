package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.4"

    init {
        list.add(ChildResult(85.8, 92.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(82.2, 85.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 82.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.5, 96.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

