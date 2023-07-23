package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.11"

    init {
        list.add(ChildResult(91.9, 99.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.1, 91.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 88.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.1, 102.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(102.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


