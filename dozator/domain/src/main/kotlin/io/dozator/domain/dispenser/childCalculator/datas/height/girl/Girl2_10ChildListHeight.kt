package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_10ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.10"

    init {
        list.add(ChildResult(90.0, 97.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.2, 89.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 86.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.4, 101.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

