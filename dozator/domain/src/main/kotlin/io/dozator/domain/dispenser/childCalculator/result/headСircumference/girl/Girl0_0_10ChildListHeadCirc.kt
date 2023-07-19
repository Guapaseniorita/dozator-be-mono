package headСircumference.girl

import child.ChildResult

class Girl0_0_10ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(37.5, 39.8))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(36.2, 37.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 36.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.9, 41.1))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.2, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


