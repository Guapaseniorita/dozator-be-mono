package weight.boy

import child.ChildResult

class Boy1_5ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.5"

    init {
        list.add(ChildResult(9.7, 11.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.6,9.6))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,8.5))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.0,13.4))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

