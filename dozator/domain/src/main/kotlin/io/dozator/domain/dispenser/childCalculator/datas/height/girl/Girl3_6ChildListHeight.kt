package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_6ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.6"

    init {
        list.add(ChildResult(95.1, 103.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.9, 95.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 90.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.1, 107.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

