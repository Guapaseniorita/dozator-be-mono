package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.8"

    init {
        list.add(ChildResult(96.3, 104.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.0, 96.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 91.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(104.5, 108.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

