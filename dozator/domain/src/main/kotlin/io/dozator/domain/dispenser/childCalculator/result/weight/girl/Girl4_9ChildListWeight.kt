package weight.girl

import child.ChildResult

class Girl4_9ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "4.9"

    init {
        list.add(ChildResult(15.4, 20.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.4, 15.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 13.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.6, 24.1))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(25.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

