package weight.girl

import child.ChildResult

class Girl0_0_10ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(4.8, 6.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.1, 4.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 4.0))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.1, 6.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.0, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

