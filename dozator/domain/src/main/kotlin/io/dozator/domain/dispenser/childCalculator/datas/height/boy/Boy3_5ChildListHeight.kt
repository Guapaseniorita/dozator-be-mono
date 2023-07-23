package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.5"

    init {
        list.add(ChildResult(95.4, 103.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(91.4, 95.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 91.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.2, 107.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


