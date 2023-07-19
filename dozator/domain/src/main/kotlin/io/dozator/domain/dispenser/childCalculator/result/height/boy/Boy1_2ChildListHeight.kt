package height.boy

import child.ChildResult

class Boy1_2ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.2"

    init {
        list.add(ChildResult(75.7, 80.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(73.1, 75.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 73.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.5, 83.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


