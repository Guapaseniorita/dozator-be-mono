package headСircumference.boy

import child.ChildResult

class Boy1_11ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "1.11"

    init {
        list.add(ChildResult(46.9, 49.4))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.4, 46.8))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.5, 50.8))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.9, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

