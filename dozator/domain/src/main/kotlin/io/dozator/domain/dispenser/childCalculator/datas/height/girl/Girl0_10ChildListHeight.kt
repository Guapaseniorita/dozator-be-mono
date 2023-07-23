package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.10"

    init {
        list.add(ChildResult(69.1, 73.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(66.5, 69.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 66.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(73.9, 76.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

