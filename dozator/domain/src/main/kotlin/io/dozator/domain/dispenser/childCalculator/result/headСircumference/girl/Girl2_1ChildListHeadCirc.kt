package headСircumference.girl

import child.ChildResult

class Girl2_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.1"

    init {
        list.add(ChildResult(46.0, 48.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.5, 45.9))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.7, 50.1))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.2, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

