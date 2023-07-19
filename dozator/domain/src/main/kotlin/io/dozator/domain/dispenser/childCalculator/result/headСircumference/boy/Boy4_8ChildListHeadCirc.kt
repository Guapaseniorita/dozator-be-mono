package headСircumference.boy

import child.ChildResult

class Boy4_8ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "4.8"

    init {
        list.add(ChildResult(49.2, 52.0))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.6, 49.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.1, 53.5))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(53.6, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

