package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_2ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.2"

    init {
        list.add(ChildResult(50.5, 54.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(48.5, 50.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 48.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(54.3, 56.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
