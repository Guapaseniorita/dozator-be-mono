package headСircumference.boy

import child.ChildResult

class Boy0_10ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.10"

    init {
        list.add(ChildResult(44.2, 46.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.9, 44.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 42.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.7, 47.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

