package headСircumference.boy

import child.ChildResult

class Boy4_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "4.6"

    init {
        list.add(ChildResult(49.1, 51.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.5, 49.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.0, 53.5))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(53.6, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

