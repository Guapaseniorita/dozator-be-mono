package height.boy

import child.ChildResult

class Boy0_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.10"

    init {
        list.add(ChildResult(71.1, 75.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(68.7, 71.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 68.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.6, 77.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(78.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


