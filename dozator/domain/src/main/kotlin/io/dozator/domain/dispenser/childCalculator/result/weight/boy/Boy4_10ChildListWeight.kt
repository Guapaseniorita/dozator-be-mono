package weight.boy

import child.ChildResult

class Boy4_10ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "4.10"

    init {
        list.add(ChildResult(15.9, 20.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.8,15.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,13.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(20.6,23.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(23.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

