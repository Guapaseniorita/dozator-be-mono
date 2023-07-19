package weight.boy

import child.ChildResult

class Boy3_1ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "3.1"

    init {
        list.add(ChildResult(13.0, 16.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.4,12.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,11.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(16.4,18.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.7, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

