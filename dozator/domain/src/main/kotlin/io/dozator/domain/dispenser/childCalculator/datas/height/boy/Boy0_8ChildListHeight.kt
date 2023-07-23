package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.8"

    init {
        list.add(ChildResult(68.5, 72.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(66.2, 68.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 66.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.8, 75.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


