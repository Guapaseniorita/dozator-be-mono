package io.dozator.domain.dispenser.childCalculator.datas.weight.girl


import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl1_6ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "1.6"

    init {
        list.add(ChildResult(9.2, 11.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.1, 9.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 8.0))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.6, 13.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

