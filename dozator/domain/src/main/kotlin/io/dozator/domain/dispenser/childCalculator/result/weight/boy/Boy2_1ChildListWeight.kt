package weight.boy

import child.ChildResult

class Boy2_1ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "2.1"

    init {
        list.add(ChildResult(11.1, 13.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.8,11.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,9.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.9,15.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
