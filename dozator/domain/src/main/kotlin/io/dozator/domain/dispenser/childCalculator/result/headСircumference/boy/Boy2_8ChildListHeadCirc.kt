package headСircumference.boy

import child.ChildResult

class Boy2_8ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "2.8"

    init {
        list.add(ChildResult(47.8, 50.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(46.3, 47.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 46.2))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.5, 51.9))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.0, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

