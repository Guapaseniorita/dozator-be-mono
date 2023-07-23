package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.5"

    init {
        list.add(ChildResult(76.9, 82.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(74.0, 76.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 73.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(82.5, 85.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}