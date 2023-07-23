package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.6"

    init {
        list.add(ChildResult(65.6, 69.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(63.3, 65.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 63.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(69.8, 71.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


