package height.boy

import child.ChildResult

class Boy4_1ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.1"

    init {
        list.add(ChildResult(99.8, 108.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.4, 99.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 95.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.1, 112.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


