package headСircumference.girl

import child.ChildResult

class Girl4_8ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.8"

    init {
        list.add(ChildResult(48.4, 51.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.9, 48.3))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.2, 52.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


