package headСircumference.boy

import child.ChildResult

class Boy1_3ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "1.3"

    init {
        list.add(ChildResult(45.6, 48.0))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.2, 45.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.1))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.1, 49.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

