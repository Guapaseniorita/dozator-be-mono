package headСircumference.girl

import child.ChildResult

class Girl1_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "1.1"

    init {
        list.add(ChildResult(43.9, 46.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.4, 43.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 42.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.5, 47.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


