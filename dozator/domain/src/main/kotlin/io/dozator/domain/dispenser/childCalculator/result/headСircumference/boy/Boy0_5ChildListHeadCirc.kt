package headСircumference.boy

import child.ChildResult

class Boy0_5ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.5"

    init {
        list.add(ChildResult(41.5, 43.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(40.1, 41.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 40.0))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(43.8, 45.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

