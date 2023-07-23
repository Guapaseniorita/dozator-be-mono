package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_1ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.1"

    init {
        list.add(ChildResult(93.1, 100.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.2, 93.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 89.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.5, 104.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(104.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


