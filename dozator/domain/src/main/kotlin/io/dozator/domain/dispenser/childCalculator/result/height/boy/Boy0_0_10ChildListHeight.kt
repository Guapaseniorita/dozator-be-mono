package height.boy

import child.ChildResult

class Boy0_0_10ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(57.5, 61.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.4, 57.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 55.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(61.4, 63.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(63.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
