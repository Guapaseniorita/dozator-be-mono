package height.boy

import child.ChildResult

class Boy4_3ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.3"

    init {
        list.add(ChildResult(100.8, 109.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.4, 100.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 96.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.3, 113.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


