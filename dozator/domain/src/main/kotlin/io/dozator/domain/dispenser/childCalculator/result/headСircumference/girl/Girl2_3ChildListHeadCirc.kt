package headСircumference.girl

import child.ChildResult

class Girl2_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.3"

    init {
        list.add(ChildResult(46.3, 48.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.8, 46.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.7))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.0, 50.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


