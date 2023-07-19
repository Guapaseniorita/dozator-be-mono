package headСircumference.boy

import child.ChildResult

class Boy0_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.11"

    init {
        list.add(ChildResult(44.6, 46.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.2, 44.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 43.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.0, 48.3))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.4, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

