package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.0"

    init {
        list.add(ChildResult(99.2, 107.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.9, 99.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 94.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.5, 111.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


