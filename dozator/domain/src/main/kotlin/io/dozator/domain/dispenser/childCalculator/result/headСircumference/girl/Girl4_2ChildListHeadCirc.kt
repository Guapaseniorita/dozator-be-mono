package headСircumference.girl

import child.ChildResult

class Girl4_2ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.2"

    init {
        list.add(ChildResult(48.1, 50.8))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.6, 48.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.9, 52.3))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.4, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


