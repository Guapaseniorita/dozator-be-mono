package weight.boy

import child.ChildResult

class Boy2_4ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "2.4"

    init {
        list.add(ChildResult(11.6, 14.4))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.2,11.5))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,10.1))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.5,16.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(16.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

