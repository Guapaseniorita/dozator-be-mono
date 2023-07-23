package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy1_3ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.3"

    init {
        list.add(ChildResult(9.3, 11.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.3,9.2))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,8.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.5,12.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
