package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.10"

    init {
        list.add(ChildResult(81.6, 87.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(78.4, 81.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 78.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(87.7, 90.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

