package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy5_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "5.0"

    init {
        list.add(ChildResult(105.4, 114.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.7, 105.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 100.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.6, 119.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(119.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


