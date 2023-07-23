package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.7"

    init {
        list.add(ChildResult(89.3, 96.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.7, 89.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 85.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.1, 99.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


