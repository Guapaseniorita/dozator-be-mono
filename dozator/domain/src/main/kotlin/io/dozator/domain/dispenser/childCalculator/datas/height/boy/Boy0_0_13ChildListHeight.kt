package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_13ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.13"

    init {
        list.add(ChildResult(59.5, 63.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.3, 59.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 57.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(63.4, 65.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(65.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
