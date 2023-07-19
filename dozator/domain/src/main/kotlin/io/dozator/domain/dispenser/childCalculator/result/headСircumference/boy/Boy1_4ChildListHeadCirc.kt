package headСircumference.boy

import child.ChildResult

class Boy1_4ChildListHeadCirc(headCirc: Double) : ChildListHeadCircBoy() {
    private val age = "1.4"

    init {
        list.add(ChildResult(45.8, 48.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(44.4, 45.7))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 44.3))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(48.3, 49.6))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(49.7, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}

