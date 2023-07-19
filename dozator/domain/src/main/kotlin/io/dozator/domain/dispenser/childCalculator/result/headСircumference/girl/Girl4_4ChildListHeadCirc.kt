package headСircumference.girl

import child.ChildResult

class Girl4_4ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.4"

    init {
        list.add(ChildResult(48.2, 50.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.7, 48.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.6))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.0, 52.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


