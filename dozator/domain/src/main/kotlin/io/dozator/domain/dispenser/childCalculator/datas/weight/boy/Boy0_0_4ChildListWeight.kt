package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_4ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(3.9, 4.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(3.3,3.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,3.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.0,5.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

