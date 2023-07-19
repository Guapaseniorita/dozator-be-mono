package weight.boy

import child.ChildResult

class Boy0_0_6ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(4.4, 5.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(3.8,4.3))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,3.7))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(5.6,6.3))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(6.4, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}



