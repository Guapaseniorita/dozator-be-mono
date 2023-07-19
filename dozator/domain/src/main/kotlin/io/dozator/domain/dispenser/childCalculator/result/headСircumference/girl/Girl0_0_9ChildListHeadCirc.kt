package headСircumference.girl

import child.ChildResult

class Girl0_0_9ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "0.0.9"

    init {
        list.add(ChildResult(37.2, 39.5))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(35.9, 37.1))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 35.8))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(39.6, 40.8))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(40.9, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


