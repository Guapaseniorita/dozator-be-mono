package weight.girl

import child.ChildResult

class Girl3_0ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "3.0"

    init {
        list.add(ChildResult(12.3, 15.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.8, 12.2))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 10.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.8, 18.1))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

