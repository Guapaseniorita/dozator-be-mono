package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_9ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.9"

    init {
        list.add(ChildResult(67.8, 72.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(65.3, 67.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 65.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.6, 75.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

