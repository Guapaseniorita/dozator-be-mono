package height.boy

import child.ChildResult

class Boy3_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.0"

    init {
        list.add(ChildResult(92.5, 99.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.7, 92.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 88.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.8, 103.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


