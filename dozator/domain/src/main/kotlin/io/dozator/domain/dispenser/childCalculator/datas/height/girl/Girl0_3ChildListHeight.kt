package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.3"

    init {
        list.add(ChildResult(57.8, 61.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.6, 57.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 55.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(61.9, 64.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

