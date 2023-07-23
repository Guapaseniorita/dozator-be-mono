package io.dozator.domain.dispenser.childCalculator.datas.height.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(54.4, 58.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(52.3, 54.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 52.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(58.2, 60.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(60.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
