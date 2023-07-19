package height.boy

import child.ChildResult

class Boy1_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.4"

    init {
        list.add(ChildResult(77.7, 82.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.0, 77.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 74.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(82.8, 85.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


