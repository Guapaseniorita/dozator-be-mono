package headСircumference.boy

import child.ChildResult

class Boy2_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "2.1"

    init {
        list.add(ChildResult(47.1, 49.6))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.6, 47.0))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.5))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.7, 51.1))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.2, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

