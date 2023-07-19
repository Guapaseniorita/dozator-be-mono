package headСircumference.girl

import child.ChildResult

class Girl0_0_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(36.2, 38.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(34.9, 36.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 34.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(38.5, 39.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


