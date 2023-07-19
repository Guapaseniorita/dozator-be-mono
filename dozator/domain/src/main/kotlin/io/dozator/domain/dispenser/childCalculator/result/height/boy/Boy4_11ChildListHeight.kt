package height.boy

import child.ChildResult

class Boy4_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.11"

    init {
        list.add(ChildResult(104.9, 113.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.2, 104.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 100.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.0, 118.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(118.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


