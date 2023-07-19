package weight.girl

import child.ChildResult

class Girl0_0_12ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.12"

    init {
        list.add(ChildResult(5.1, 6.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.4, 5.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 4.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.5, 7.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

