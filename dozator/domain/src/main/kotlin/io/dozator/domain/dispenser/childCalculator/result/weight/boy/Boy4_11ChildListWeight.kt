package weight.boy

import child.ChildResult

class Boy4_11ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "4.11"

    init {
        list.add(ChildResult(16.0, 20.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.0,15.9))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,13.9))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.8,23.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(24.0, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

