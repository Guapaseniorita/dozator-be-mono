package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult


class Girl0_7ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.7"

    init {
        list.add(ChildResult(6.9, 8.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.0, 6.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 5.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.6, 9.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
