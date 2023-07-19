package weight.girl

import child.ChildResult

class Girl4_6ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.6"

    init {
        list.add(ChildResult(15.0, 19.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.0, 14.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 12.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.9, 23.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(24.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

