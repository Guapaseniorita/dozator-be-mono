package weight.girl

import child.ChildResult

class Girl4_8ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.8"

    init {
        list.add(ChildResult(15.3, 20.2))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.3, 15.2))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 13.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.3, 23.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(24.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

