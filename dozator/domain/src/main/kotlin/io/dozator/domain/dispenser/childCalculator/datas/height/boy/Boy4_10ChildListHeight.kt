package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.10"

    init {
        list.add(ChildResult(104.4, 113.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.7, 104.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 99.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.4, 118.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(118.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


