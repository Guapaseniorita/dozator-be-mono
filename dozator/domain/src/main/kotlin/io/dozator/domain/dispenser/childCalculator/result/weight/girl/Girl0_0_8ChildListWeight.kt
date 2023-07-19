package weight.girl

import child.ChildResult

class Girl0_0_8ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.8"

    init {
        list.add(ChildResult(4.5, 5.6))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(3.8, 4.4))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 3.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.7, 6.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
