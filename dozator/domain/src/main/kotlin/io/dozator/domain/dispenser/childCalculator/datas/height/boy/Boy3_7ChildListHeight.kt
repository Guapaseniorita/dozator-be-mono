package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.7"

    init {
        list.add(ChildResult(96.5, 104.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.4, 96.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 92.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(104.5, 108.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


