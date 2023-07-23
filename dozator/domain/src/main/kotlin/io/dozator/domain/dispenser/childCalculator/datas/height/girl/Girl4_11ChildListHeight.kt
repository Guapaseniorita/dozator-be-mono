package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_11ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.11"

    init {
        list.add(ChildResult(104.3, 113.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.5, 104.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 99.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.6, 118.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(118.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

