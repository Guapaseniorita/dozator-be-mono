package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(56.0, 59.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.8, 55.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 53.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(60.0, 62.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

