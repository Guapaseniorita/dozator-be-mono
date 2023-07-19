package headСircumference.boy

import child.ChildResult

class Boy0_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.3"

    init {
        list.add(ChildResult(39.4, 41.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(38.1, 39.3))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 38.0))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.7, 42.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

