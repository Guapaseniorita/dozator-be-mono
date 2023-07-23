package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.10"

    init {
        list.add(ChildResult(98.2, 106.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.0, 98.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 93.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(106.3, 110.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


