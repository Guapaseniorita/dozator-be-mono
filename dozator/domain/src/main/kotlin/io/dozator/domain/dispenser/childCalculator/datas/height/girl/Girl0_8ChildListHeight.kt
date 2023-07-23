package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.8"

    init {
        list.add(ChildResult(66.5, 71.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.0, 66.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 63.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(71.1, 73.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(73.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

