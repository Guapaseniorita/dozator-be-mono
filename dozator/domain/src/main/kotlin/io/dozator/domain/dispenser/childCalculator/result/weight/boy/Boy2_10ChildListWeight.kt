package weight.boy

import child.ChildResult

class Boy2_10ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "2.10"

    init {
        list.add(ChildResult(12.5, 15.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.0,12.4))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,10.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.8,17.8))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

