package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.10"

    init {
        list.add(ChildResult(83.2, 88.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.2, 83.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 80.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.0, 91.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


