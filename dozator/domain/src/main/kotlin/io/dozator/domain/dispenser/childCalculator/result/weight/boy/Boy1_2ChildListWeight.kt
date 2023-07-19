package weight.boy

import child.ChildResult

class Boy1_2ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.2"

    init {
        list.add(ChildResult(9.1, 11.2))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.1,9.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,8.0))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(11.3,12.6))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.7, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

