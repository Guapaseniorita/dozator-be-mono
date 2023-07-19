package weight.girl

import child.ChildResult

class Girl1_5ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "1.5"

    init {
        list.add(ChildResult(9.0, 11.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.9, 8.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 7.8))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.4, 12.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

