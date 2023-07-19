package height.boy

import child.ChildResult

class Boy1_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.7"

    init {
        list.add(ChildResult(80.6, 85.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(77.7, 80.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 77.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.0, 88.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


