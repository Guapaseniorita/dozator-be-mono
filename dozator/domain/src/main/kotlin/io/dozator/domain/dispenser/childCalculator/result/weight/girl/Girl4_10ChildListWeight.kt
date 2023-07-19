package weight.girl

import child.ChildResult

class Girl4_10ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.10"

    init {
        list.add(ChildResult(15.6, 20.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.5, 15.5))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 13.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.8, 24.4))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(25.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

