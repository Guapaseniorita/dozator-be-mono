package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_9ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.9"

    init {
        list.add(ChildResult(82.4, 87.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.4, 82.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 79.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.0, 90.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(91.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


