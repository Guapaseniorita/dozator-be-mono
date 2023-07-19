package weight.boy

import child.ChildResult

class Boy1_6ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.6"

    init {
        list.add(ChildResult(9.9, 12.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.8,9.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,8.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.2,13.7))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.8, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

