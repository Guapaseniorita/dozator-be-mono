package headСircumference.boy

import child.ChildResult

class Boy0_6ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.6"

    init {
        list.add(ChildResult(42.2, 44.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(40.9, 42.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 40.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.6, 45.8))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.9, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

