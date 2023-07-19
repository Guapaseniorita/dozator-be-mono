package weight.girl

import child.ChildResult

class Girl1_8ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "1.8"

    init {
        list.add(ChildResult(9.5, 12.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.4, 9.4))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 8.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.1, 13.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.7, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
