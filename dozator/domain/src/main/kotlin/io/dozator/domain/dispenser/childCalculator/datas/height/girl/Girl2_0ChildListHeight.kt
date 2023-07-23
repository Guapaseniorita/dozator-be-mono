package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_0ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.0"

    init {
        list.add(ChildResult(83.3, 89.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.0, 83.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 79.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.6, 92.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

