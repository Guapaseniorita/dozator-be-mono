package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.3"

    init {
        list.add(ChildResult(50.6, 54.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(48.6, 50.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 48.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(54.4, 56.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

