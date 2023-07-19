package height.boy

import child.ChildResult

class Boy4_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.4"

    init {
        list.add(ChildResult(101.3, 109.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.9, 101.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 96.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.9, 114.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


