package weight.girl

import child.ChildResult

class Girl2_9ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "2.9"

    init {
        list.add(ChildResult(11.8, 15.0))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.4, 11.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 10.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.1, 17.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.3, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

