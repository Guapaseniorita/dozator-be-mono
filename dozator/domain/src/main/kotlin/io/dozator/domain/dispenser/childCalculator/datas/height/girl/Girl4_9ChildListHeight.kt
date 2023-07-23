package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_9ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.9"

    init {
        list.add(ChildResult(103.3, 112.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.5, 103.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 98.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.5, 117.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(117.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

