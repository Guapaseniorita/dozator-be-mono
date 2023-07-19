package weight.boy

import child.ChildResult

class Boy3_4ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "3.4"

    init {
        list.add(ChildResult(13.4, 16.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.8,13.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,11.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.0,19.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

