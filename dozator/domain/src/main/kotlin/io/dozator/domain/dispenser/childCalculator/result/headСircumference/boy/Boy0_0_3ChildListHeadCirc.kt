package headСircumference.boy

import child.ChildResult

class Boy0_0_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.0.3"

    init {
        list.add(ChildResult(35.5, 37.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(34.2, 35.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 34.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(37.7, 38.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

