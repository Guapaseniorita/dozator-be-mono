package weight.boy

import child.ChildResult

class Boy2_8ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "2.8"

    init {
        list.add(ChildResult(12.2, 15.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.8,12.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,10.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.4,17.4))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(17.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
