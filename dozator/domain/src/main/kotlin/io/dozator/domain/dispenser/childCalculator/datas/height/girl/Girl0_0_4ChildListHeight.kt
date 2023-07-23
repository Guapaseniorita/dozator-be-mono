package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(51.5, 55.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(49.5, 51.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 49.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.3, 57.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

