package weight.girl

import child.ChildResult

class Girl4_7ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.7"

    init {
        list.add(ChildResult(15.2, 20.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.2, 15.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 13.1))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.1, 23.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(24.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

