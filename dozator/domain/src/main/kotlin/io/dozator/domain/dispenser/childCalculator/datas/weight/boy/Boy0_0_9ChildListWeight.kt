package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_9ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.0.9"

    init {
        list.add(ChildResult(5.1, 6.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.4,5.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,4.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.4,7.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.3, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

