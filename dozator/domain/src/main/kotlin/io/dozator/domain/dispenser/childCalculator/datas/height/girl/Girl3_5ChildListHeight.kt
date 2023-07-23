package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.5"

    init {
        list.add(ChildResult(94.5, 102.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.4, 94.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 90.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(102.4, 106.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(106.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

