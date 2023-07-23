package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.0"

    init {
        list.add(ChildResult(73.5, 78.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(71.0, 73.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 70.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(78.1, 80.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


