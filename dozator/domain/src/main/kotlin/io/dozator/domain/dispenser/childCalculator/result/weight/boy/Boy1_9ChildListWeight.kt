package weight.boy

import child.ChildResult

class Boy1_9ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.9"

    init {
        list.add(ChildResult(10.4, 12.8))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.2,10.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,9.1))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.9,14.5))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.6, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

