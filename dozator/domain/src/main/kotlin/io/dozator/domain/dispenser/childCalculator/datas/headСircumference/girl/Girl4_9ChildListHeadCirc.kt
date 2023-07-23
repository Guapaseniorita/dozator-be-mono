package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl4_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.9"

    init {
        list.add(ChildResult(48.5, 51.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.9, 48.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.2, 52.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


