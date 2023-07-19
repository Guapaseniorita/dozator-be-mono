package weight.boy

import child.ChildResult

class Boy1_11ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "1.11"

    init {
        list.add(ChildResult(10.8, 13.3))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(9.5,10.7))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,9.4))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.4,15.0))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(15.1, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
