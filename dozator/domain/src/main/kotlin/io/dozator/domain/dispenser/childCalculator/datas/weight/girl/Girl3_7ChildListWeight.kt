package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_7ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "3.7"

    init {
        list.add(ChildResult(13.4, 17.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.7, 13.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 11.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.4, 20.1))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(21.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

