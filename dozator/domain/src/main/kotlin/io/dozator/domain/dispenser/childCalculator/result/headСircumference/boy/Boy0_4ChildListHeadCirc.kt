package headСircumference.boy

import child.ChildResult

class Boy0_4ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "0.4"

    init {
        list.add(ChildResult(40.5, 42.7))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.2, 40.4))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 39.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(42.8, 44.0))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.1, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

