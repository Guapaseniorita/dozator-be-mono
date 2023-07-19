package headСircumference.boy

import child.ChildResult

class Boy4_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "4.3"

    init {
        list.add(ChildResult(49.0, 51.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.4, 48.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.8, 53.3))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(53.4, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

