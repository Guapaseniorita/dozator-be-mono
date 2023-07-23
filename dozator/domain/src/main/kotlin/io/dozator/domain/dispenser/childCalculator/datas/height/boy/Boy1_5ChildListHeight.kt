package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.5"

    init {
        list.add(ChildResult(78.7, 83.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.0, 78.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 75.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.9, 86.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


