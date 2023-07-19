package headСircumference.boy

import child.ChildResult

class Boy2_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "2.9"

    init {
        list.add(ChildResult(47.9, 50.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.4, 47.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.6, 52.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

