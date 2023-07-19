package weight.girl

import child.ChildResult

class Girl0_0_6ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(4.1, 5.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(3.5, 4.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 3.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.2, 6.0))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
