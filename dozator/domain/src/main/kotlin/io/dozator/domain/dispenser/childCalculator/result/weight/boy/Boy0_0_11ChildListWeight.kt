package weight.boy

import child.ChildResult

class Boy0_0_11ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.0.11"

    init {
        list.add(ChildResult(5.4, 6.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.7,5.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,4.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.8,7.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.7, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

