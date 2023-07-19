package height.boy

import child.ChildResult

class Boy0_0_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.7"

    init {
        list.add(ChildResult(55.2, 59.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.1, 55.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 53.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.1, 61.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(61.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
