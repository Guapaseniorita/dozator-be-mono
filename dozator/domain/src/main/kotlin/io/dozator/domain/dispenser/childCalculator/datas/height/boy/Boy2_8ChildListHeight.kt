package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.8"

    init {
        list.add(ChildResult(90.0, 96.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.4, 89.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 86.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.9, 100.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


