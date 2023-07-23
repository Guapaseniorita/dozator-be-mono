package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult
import io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy.ChildListHeadCircBoy

class Boy0_0_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.0.11"

    init {
        list.add(ChildResult(38.8, 41.0))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(37.5, 38.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 37.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.1, 42.3))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.4, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

