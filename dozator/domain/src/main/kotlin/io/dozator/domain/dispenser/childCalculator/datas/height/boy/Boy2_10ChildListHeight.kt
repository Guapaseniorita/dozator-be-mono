package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.10"

    init {
        list.add(ChildResult(91.2, 98.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(87.5, 91.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 87.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.4, 102.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(102.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


