package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_2ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.2"

    init {
        list.add(ChildResult(10.6, 13.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.4, 10.5))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 9.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.5, 15.4))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(16.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

