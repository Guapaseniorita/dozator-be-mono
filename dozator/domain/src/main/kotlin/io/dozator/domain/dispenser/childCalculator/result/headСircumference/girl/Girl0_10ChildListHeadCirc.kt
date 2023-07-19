package headСircumference.girl

import child.ChildResult

class Girl0_10ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.10"

    init {
        list.add(ChildResult(43.0, 45.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.5, 42.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 41.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.6, 46.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


