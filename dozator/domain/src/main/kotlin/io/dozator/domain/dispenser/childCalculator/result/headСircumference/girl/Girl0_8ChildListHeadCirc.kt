package headСircumference.girl

import child.ChildResult

class Girl0_8ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.8"

    init {
        list.add(ChildResult(42.1, 44.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(40.7, 42.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 40.6))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.7, 46.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


