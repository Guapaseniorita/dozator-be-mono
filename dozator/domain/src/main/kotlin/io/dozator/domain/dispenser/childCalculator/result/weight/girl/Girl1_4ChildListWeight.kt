package weight.girl

import child.ChildResult

class Girl1_4ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "1.4"

    init {
        list.add(ChildResult(8.8, 11.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.7, 8.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 7.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.1, 12.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

