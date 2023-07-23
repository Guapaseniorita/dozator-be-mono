package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_2ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.2"

    init {
        list.add(ChildResult(99.6, 108.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.1, 99.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 95.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.3, 112.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

