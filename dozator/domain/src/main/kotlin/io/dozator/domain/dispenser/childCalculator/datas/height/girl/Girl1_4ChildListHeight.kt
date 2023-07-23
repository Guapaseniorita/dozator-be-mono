package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.4"

    init {
        list.add(ChildResult(75.9, 81.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(73.0, 75.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 72.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.4, 84.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

