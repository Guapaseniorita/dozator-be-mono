package headСircumference.girl

import child.ChildResult

class Girl4_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "4.1"

    init {
        list.add(ChildResult(48.1, 50.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.5, 48.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.8, 52.2))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.3, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


