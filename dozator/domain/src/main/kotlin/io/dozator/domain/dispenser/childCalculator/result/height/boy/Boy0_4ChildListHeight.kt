package height.boy

import child.ChildResult

class Boy0_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.4"

    init {
        list.add(ChildResult(61.9, 65.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.7, 61.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 59.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(66.0, 68.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(68.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
