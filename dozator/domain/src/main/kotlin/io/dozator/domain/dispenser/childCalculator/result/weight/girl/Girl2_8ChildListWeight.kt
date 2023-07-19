package weight.girl

import child.ChildResult

class Girl2_8ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.8"

    init {
        list.add(ChildResult(11.7, 14.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.3, 11.6))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 10.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.9, 17.1))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

