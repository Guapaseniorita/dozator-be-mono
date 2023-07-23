package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy0_0_12ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.0.12"

    init {
        list.add(ChildResult(5.6, 6.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.9,5.5))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,4.8))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.0,7.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

