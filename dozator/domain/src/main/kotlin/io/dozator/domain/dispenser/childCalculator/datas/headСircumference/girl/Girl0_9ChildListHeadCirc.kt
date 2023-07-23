package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl0_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.9"

    init {
        list.add(ChildResult(42.6, 45.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.2, 42.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 41.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.2, 46.5))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.6, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


