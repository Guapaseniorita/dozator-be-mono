package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_0_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.8"

    init {
        list.add(ChildResult(54.7, 58.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(52.5, 54.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 52.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(58.6, 60.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(60.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

