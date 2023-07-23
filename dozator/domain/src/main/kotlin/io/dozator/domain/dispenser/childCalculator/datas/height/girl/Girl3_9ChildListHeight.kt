package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_9ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.9"

    init {
        list.add(ChildResult(96.8, 105.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.5, 96.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 92.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.1, 109.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

