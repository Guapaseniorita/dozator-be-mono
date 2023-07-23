package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.9"

    init {
        list.add(ChildResult(103.9, 112.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.3, 103.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 99.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.8, 117.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(117.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


