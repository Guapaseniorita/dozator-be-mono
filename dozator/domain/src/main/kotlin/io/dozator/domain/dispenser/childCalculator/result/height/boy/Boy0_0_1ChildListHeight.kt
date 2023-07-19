package height.boy

import child.ChildResult

class Boy0_0_1ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.1"

    init {
        list.add(ChildResult(49.3, 52.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(47.3, 49.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 47.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.0, 54.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}



