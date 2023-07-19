package height.boy

import child.ChildResult

class Boy4_2ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.2"

    init {
        list.add(ChildResult(100.3, 108.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.9, 100.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 95.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.7, 113.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


