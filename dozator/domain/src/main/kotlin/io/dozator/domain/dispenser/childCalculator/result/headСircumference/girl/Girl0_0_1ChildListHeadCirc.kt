package headСircumference.girl

import child.ChildResult

class Girl0_0_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.0.1"

    init {
        list.add(ChildResult(33.5, 35.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(32.2, 33.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 32.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(35.7, 36.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(37.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

