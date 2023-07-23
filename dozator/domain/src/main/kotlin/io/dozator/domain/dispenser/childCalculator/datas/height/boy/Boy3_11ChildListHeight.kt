package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.11"

    init {
        list.add(ChildResult(98.7, 106.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.4, 98.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 94.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(106.9, 111.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


