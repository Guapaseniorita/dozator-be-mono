package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.9"

    init {
        list.add(ChildResult(69.8, 74.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(67.5, 69.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 67.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(74.2, 76.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


