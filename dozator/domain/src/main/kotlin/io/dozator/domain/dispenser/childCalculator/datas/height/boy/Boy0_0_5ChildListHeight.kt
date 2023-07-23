package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.5"

    init {
        list.add(ChildResult(53.5, 57.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(51.4, 53.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 51.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.3, 59.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}



