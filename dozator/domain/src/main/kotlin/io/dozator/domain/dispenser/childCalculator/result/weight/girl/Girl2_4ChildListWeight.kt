package weight.girl

import child.ChildResult

class Girl2_4ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.4"

    init {
        list.add(ChildResult(11.0, 13.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.7, 10.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 9.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.0, 16.0))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.0, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

