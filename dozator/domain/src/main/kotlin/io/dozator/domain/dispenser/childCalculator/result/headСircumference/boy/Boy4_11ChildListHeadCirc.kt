package headСircumference.boy

import child.ChildResult

class Boy4_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "4.11"

    init {
        list.add(ChildResult(49.3, 52.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.7, 49.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.6))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.2, 53.7))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(53.8, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

