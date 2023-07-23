package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.4"

    init {
        list.add(ChildResult(100.7, 109.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.1, 100.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 96.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.5, 114.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

