package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_3ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.3"

    init {
        list.add(ChildResult(76.7, 81.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(74.1, 76.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 74.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.7, 84.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


