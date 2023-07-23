package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.10"

    init {
        list.add(ChildResult(103.8, 112.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.0, 103.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 98.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.0, 117.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(117.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
