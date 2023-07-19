package weight.girl

import child.ChildResult

class Girl3_6ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "3.6"

    init {
        list.add(ChildResult(13.2, 17.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.6, 13.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 11.5))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.2, 19.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

