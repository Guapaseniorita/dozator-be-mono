package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult


class Girl4_4ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.4"

    init {
        list.add(ChildResult(14.7, 19.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.8, 14.6))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 12.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.4, 22.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(23.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
