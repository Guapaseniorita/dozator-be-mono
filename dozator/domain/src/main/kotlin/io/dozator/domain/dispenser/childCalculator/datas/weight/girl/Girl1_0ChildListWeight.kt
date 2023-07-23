package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_0ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "1.0"

    init {
        list.add(ChildResult(8.0, 10.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.0, 7.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 6.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.1, 11.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}


