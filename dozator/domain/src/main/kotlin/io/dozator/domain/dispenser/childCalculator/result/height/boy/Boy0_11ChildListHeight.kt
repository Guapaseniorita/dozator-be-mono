package height.boy

import child.ChildResult

class Boy0_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.11"

    init {
        list.add(ChildResult(72.3, 76.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(69.9, 72.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 69.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.9, 79.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


