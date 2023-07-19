package headСircumference.girl

import child.ChildResult

class Girl2_0ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.0"

    init {
        list.add(ChildResult(45.9, 48.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.4, 45.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.6, 50.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

