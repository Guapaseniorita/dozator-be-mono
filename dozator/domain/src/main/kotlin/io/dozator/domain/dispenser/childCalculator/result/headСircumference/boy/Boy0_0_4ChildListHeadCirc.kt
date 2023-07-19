package headСircumference.boy

import child.ChildResult

class Boy0_0_4ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(36.0, 38.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(34.8, 35.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 34.7))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(38.3, 39.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

