package weight.boy

import child.ChildResult

class Boy0_7ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.7"

    init {
        list.add(ChildResult(7.5, 9.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.7,7.4))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,6.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.2,10.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(10.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
