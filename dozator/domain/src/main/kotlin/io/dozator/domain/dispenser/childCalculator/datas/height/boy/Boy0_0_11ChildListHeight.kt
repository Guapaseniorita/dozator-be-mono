package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.11"

    init {
        list.add(ChildResult(58.2, 62.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.0, 58.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 55.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.1, 64.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
