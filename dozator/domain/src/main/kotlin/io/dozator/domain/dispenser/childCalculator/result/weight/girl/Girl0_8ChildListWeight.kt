package weight.girl

import child.ChildResult

class Girl0_8ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.8"

    init {
        list.add(ChildResult(7.1, 8.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.3, 7.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 6.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.0, 10.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

