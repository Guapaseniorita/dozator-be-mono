package headСircumference.boy

import child.ChildResult

class Boy0_7ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.7"

    init {
        list.add(ChildResult(42.8, 45.1))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(41.5, 42.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 41.4))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.2, 46.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

