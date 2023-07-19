package headСircumference.boy

import child.ChildResult

class Boy0_0_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(37.0, 39.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(35.7, 36.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 35.6))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.2, 40.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(40.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

