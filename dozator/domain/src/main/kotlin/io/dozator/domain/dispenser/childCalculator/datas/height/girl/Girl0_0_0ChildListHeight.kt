package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_0ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.0"

    init {
        list.add(ChildResult(47.4, 50.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(45.4, 47.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 45.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(51.0, 52.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

