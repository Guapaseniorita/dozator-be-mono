package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Boy4_6ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "4.6"

    init {
        list.add(ChildResult(15.3, 19.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.4,15.2))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,13.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.8,22.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(22.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

