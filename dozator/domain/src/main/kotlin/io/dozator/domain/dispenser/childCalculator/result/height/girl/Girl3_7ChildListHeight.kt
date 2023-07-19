package height.girl

import child.ChildResult

class Girl3_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.7"

    init {
        list.add(ChildResult(95.7, 103.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(91.5, 95.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 91.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.8, 107.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

