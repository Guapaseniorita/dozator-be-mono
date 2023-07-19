package headСircumference.boy

import child.ChildResult

class Boy3_5ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "3.5"

    init {
        list.add(ChildResult(48.5, 51.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.9, 48.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.3, 52.7))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.8, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

