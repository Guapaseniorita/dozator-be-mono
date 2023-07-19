package headСircumference.girl

import child.ChildResult

class Girl2_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.11"

    init {
        list.add(ChildResult(47.1, 49.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.6, 47.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.8, 51.2))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.3, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


