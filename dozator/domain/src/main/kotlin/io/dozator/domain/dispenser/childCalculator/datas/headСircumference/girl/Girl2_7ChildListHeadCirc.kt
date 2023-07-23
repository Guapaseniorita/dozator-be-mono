package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult

class Girl2_7ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.7"

    init {
        list.add(ChildResult(46.7, 49.3))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.2, 46.6))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.4, 50.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


