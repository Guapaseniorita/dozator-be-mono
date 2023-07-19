package weight.boy

import child.ChildResult

class Boy0_8ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.8"

    init {
        list.add(ChildResult(7.8, 9.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.9,7.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,6.8))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.6,10.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

