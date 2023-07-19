package weight.girl

import child.ChildResult

class Girl0_0_9ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.9"

    init {
        list.add(ChildResult(4.7, 5.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.0, 4.6))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 3.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.9, 6.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
