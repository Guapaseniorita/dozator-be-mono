package headСircumference.girl

import child.ChildResult

class Girl2_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "2.6"

    init {
        list.add(ChildResult(46.6, 49.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.1, 46.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.0))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.3, 50.7))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.8, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


