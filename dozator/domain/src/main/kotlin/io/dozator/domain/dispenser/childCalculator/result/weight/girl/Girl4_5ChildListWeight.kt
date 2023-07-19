package weight.girl

import child.ChildResult

class Girl4_5ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.5"

    init {
        list.add(ChildResult(14.9, 19.6))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.9, 14.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 12.8))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.7, 22.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(23.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

