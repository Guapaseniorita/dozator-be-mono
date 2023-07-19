package headСircumference.boy

import child.ChildResult

class Boy0_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.9"

    init {
        list.add(ChildResult(43.8, 46.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.5, 43.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 42.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.3, 47.5))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.6, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

