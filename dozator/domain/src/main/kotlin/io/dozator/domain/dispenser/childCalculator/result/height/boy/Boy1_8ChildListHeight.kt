package height.boy

import child.ChildResult

class Boy1_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.8"

    init {
        list.add(ChildResult(81.5, 86.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(78.6, 81.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 78.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(87.0, 89.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


