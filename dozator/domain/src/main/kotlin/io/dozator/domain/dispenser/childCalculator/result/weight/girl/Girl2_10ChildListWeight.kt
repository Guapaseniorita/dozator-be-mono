package weight.girl

import child.ChildResult

class Girl2_10ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.10"

    init {
        list.add(ChildResult(12.0, 15.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.5, 11.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 10.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.4, 17.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

