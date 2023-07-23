package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.8"

    init {
        list.add(ChildResult(103.4, 112.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.8, 103.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 98.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.3, 116.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(116.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


