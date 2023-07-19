package headСircumference.girl

import child.ChildResult

class Girl3_1ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "3.1"

    init {
        list.add(ChildResult(47.3, 49.9))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(45.8, 47.2))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 45.7))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(50.0, 51.4))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.5, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}





