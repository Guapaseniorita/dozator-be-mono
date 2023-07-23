package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_0ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.0"

    init {
        list.add(ChildResult(71.5, 76.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(68.9, 71.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 68.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.6, 79.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

