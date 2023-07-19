package weight.girl

import child.ChildResult

class Girl2_5ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.5"

    init {
        list.add(ChildResult(11.2, 14.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.8, 11.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 9.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.2, 16.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.2, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

