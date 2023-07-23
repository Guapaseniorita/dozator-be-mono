package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_1ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.1"

    init {
        list.add(ChildResult(72.7, 77.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(70.0, 72.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 69.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(77.8, 80.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

