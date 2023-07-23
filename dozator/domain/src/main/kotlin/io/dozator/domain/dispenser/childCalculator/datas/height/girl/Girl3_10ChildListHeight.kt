package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.10"

    init {
        list.add(ChildResult(97.4, 105.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.1, 97.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 93.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.8, 110.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

