package height.boy

import child.ChildResult

class Boy0_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.5"

    init {
        list.add(ChildResult(63.9, 67.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(61.7, 63.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 61.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(68.0, 70.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(70.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

