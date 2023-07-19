package weight.girl

import child.ChildResult

class Girl3_11ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "3.11"

    init {
        list.add(ChildResult(14.0, 18.2))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.2, 13.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 12.1))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.3, 21.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(22.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

