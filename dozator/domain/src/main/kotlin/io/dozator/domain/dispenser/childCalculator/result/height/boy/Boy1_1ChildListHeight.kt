package height.boy

import child.ChildResult

class Boy1_1ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.1"

    init {
        list.add(ChildResult(74.6, 79.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.1, 74.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 72.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.3, 81.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


