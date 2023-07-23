package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_12ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.12"

    init {
        list.add(ChildResult(58.8, 62.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.7, 58.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 56.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.8, 64.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
