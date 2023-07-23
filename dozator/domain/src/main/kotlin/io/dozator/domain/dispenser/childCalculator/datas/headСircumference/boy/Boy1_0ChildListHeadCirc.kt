package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildResult
import io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy.ChildListHeadCircBoy

class Boy1_0ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "1.0"

    init {
        list.add(ChildResult(44.9, 47.3))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.5, 44.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 43.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.4, 48.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

