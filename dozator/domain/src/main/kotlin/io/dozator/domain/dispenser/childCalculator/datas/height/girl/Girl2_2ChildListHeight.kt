package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_2ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.2"

    init {
        list.add(ChildResult(84.2, 90.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.8, 84.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 80.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.8, 94.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

