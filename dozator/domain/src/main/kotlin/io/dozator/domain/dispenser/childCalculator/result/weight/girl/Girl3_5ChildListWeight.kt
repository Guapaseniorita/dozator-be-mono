package weight.girl

import child.ChildResult

class Girl3_5ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "3.5"

    init {
        list.add(ChildResult(13.1, 16.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.5, 13.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 11.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(16.9, 19.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

