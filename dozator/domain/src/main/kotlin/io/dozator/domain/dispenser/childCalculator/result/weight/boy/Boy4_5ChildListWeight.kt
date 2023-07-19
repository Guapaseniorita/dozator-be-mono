package weight.boy

import child.ChildResult

class Boy4_5ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "4.5"

    init {
        list.add(ChildResult(15.2, 19.5))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.3,15.1))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,13.2))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(19.6,22.4))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(22.5, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

