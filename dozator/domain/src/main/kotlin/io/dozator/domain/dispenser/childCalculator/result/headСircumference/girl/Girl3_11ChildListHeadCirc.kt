package headСircumference.girl

import child.ChildResult

class Girl3_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "3.11"

    init {
        list.add(ChildResult(48.0, 50.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.4, 47.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.7, 52.1))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.2, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


