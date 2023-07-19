package height.boy

import child.ChildResult

class Boy3_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.4"

    init {
        list.add(ChildResult(94.8, 102.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.9, 94.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 90.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(102.5, 106.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(106.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


