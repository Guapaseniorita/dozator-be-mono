package headСircumference.girl

import child.ChildResult

class Girl1_8ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "1.8"

    init {
        list.add(ChildResult(45.3, 47.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.8, 45.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 43.7))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.0, 49.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


