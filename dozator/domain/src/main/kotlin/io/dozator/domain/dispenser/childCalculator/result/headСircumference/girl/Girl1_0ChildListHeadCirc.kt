package headСircumference.girl

import child.ChildResult

class Girl1_0ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "1.0"

    init {
        list.add(ChildResult(43.6, 46.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.2, 43.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 42.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.3, 47.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


