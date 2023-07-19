package weight.boy

import child.ChildResult

class Boy3_11ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "3.11"

    init {
        list.add(ChildResult(14.4, 18.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.6,14.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,12.5))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.4,20.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(21.0, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

