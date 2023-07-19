package weight.boy

import child.ChildResult

class Boy1_7ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.7"

    init {
        list.add(ChildResult(10.1, 12.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(8.9,10.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,8.8))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(12.5,13.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.0, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

