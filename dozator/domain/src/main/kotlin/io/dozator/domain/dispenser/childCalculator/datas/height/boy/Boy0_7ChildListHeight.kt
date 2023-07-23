package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.7"

    init {
        list.add(ChildResult(67.1, 71.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.8, 67.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 64.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(71.3, 73.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(73.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


