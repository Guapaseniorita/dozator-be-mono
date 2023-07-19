package headСircumference.girl

import child.ChildResult

class Girl2_5ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.5"

    init {
        list.add(ChildResult(46.5, 49.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.0, 46.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.9))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.2, 50.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


