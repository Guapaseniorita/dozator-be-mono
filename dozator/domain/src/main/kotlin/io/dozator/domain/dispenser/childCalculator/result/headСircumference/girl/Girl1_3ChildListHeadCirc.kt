package headСircumference.girl

import child.ChildResult

class Girl1_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "1.3"

    init {
        list.add(ChildResult(44.4, 46.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.9, 44.3))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 42.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.0, 48.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


