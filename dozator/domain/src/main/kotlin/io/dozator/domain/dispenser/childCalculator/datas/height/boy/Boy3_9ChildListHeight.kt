package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy3_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.9"

    init {
        list.add(ChildResult(97.6, 105.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.5, 97.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 93.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.7, 109.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


