package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_11ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.11"

    init {
        list.add(ChildResult(82.4, 88.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.2, 82.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 79.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.7, 91.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

