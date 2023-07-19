package weight.boy

import child.ChildResult

class Boy0_4ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.4"

    init {
        list.add(ChildResult(6.3, 7.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.6,6.2))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,5.5))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.8,8.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

