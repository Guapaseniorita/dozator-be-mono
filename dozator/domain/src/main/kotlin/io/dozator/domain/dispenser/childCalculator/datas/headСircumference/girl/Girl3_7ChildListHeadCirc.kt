package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl3_7ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "3.7"

    init {
        list.add(ChildResult(47.7, 50.3))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.2, 47.6))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.4, 51.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


