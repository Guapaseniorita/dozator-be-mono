package height.girl

import child.ChildResult

class Girl4_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.5"

    init {
        list.add(ChildResult(101.2, 110.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.6, 101.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 96.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.1, 114.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

