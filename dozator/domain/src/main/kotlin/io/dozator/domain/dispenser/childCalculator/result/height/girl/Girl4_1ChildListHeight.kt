package height.girl

import child.ChildResult

class Girl4_1ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.1"

    init {
        list.add(ChildResult(99.1, 107.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.6, 99.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 94.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(107.7, 112.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(112.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

