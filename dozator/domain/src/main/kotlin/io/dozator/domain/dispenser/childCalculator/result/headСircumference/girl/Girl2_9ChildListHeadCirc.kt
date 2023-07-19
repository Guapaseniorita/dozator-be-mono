package headСircumference.girl

import child.ChildResult

class Girl2_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.9"

    init {
        list.add(ChildResult(46.9, 49.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.4, 46.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.7, 51.1))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.2, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


