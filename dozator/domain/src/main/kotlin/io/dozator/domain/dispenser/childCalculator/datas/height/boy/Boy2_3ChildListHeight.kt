package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_3ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.3"

    init {
        list.add(ChildResult(86.5, 92.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.1, 86.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 83.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.9, 96.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


