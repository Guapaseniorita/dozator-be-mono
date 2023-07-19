package weight.boy

import child.ChildResult

class Boy1_0ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.0"

    init {
        list.add(ChildResult(8.7, 10.7))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(7.7,8.6))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,7.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.8,12.0))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

