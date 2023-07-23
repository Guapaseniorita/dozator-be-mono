package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_0ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.0"

    init {
        list.add(ChildResult(98.5, 106.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.1, 98.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 94.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.0, 111.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

