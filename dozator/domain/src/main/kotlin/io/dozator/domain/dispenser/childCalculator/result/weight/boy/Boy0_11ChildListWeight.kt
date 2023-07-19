package weight.boy

import child.ChildResult

class Boy0_11ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.11"

    init {
        list.add(ChildResult(8.5, 10.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.6,8.4))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,7.5))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.5,11.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

