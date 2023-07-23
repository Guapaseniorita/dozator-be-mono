package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.9"

    init {
        list.add(ChildResult(90.6, 97.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.9, 90.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 86.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.6, 101.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


