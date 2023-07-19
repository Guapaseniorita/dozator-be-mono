package headСircumference.girl

import child.ChildResult

class Girl1_7ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "1.7"

    init {
        list.add(ChildResult(45.1, 47.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.6, 45.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 43.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.8, 49.2))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.3, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


