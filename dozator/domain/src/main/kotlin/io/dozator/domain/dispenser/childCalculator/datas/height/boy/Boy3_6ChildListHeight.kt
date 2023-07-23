package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.6"

    init {
        list.add(ChildResult(96.0, 103.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(91.9, 95.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 91.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.8, 107.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


