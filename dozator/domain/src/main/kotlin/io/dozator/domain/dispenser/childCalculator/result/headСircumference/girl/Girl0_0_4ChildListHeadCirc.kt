package headСircumference.girl

import child.ChildResult

class Girl0_0_4ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(35.3, 37.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(34.0, 35.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 33.9))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(37.5, 38.7))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(38.8, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


