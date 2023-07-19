package headСircumference.girl

import child.ChildResult

class Girl5_0ChildListHeadCirc(headCirc: Double) : ChildListHeadCircGirl() {
    private val age = "5.0"

    init {
        list.add(ChildResult(48.6, 51.2))
        list[0].setNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(47.1, 48.5))
        list[1].setLowNorma(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(30.0, 47.0))
        list[1].setBelowNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(51.3, 52.8))
        list[3].setHighNorm(age, optimal, typeInd, headCirc, unit, type)
        list.add(ChildResult(52.9, 55.0))
        list[4].setAboveNorm(age, optimal, typeInd, headCirc, unit, type)
    }
}


