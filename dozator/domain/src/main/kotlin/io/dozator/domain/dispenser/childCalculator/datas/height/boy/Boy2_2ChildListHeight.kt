package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy2_2ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.2"

    init {
        list.add(ChildResult(85.7, 91.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(82.5, 85.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 82.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(92.0, 95.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


