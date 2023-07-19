package weight.girl

import child.ChildResult

class Girl2_3ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.3"

    init {
        list.add(ChildResult(10.8, 13.6))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.5, 10.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 9.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.7, 15.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(16.7, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

