package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.8"

    init {
        list.add(ChildResult(56.0, 59.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.9, 55.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 53.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.9, 61.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


