package headСircumference.girl

import child.ChildResult

class Girl4_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.6"

    init {
        list.add(ChildResult(48.3, 51.0))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.8, 48.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.7))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.1, 52.5))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.6, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


