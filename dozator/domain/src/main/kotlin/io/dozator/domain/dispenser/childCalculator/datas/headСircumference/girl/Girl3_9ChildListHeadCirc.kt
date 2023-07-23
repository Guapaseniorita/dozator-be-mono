package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "3.9"

    init {
        list.add(ChildResult(47.8, 50.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.3, 47.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.2))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.6, 52.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


