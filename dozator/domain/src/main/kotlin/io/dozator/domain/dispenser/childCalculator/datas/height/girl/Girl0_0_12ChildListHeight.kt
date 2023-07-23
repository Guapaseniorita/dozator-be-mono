package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_12ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.12"

    init {
        list.add(ChildResult(57.2, 61.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.0, 57.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 54.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(61.3, 63.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(63.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

