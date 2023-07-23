package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_2ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.2"

    init {
        list.add(ChildResult(92.6, 100.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.6, 92.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 88.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.3, 104.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(104.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

