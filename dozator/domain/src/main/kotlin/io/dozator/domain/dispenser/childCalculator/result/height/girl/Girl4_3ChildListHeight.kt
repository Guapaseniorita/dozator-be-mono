package height.girl

import child.ChildResult

class Girl4_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.3"

    init {
        list.add(ChildResult(100.2, 108.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.6, 100.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 95.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(108.9, 113.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(113.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

