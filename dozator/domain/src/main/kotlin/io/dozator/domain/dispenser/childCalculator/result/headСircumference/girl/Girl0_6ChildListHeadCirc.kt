package headСircumference.girl

import child.ChildResult

class Girl0_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.6"

    init {
        list.add(ChildResult(41.0, 43.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.6, 40.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 39.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.5, 44.8))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.9, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


