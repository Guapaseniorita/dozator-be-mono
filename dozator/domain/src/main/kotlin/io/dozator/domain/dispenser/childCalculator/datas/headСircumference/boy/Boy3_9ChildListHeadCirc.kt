package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult
import io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy.ChildListHeadCircBoy

class Boy3_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "3.9"

    init {
        list.add(ChildResult(48.7, 51.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.1, 48.6))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.0))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.5, 53.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(53.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

