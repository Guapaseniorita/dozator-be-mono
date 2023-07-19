package height.boy

import child.ChildResult

class Boy1_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.6"

    init {
        list.add(ChildResult(79.7, 84.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.9, 79.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 76.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.0, 87.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(87.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


