package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.5"

    init {
        list.add(ChildResult(61.9, 66.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.6, 61.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 59.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(66.2, 68.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(68.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

