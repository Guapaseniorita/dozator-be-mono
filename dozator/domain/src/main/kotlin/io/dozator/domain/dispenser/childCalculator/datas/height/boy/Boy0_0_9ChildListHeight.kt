package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.9"

    init {
        list.add(ChildResult(56.7, 60.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(54.6, 56.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 54.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(60.7, 62.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
