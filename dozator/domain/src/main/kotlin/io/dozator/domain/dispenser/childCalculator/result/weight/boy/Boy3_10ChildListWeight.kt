package weight.boy

import child.ChildResult

class Boy3_10ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "3.10"

    init {
        list.add(ChildResult(14.2, 18.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.5,14.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,12.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(18.2,20.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

