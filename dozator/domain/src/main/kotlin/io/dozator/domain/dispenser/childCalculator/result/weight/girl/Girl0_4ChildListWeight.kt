package weight.girl

import child.ChildResult

class Girl0_4ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.4"

    init {
        list.add(ChildResult(5.8, 7.2))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.0, 5.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 4.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.3, 8.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
