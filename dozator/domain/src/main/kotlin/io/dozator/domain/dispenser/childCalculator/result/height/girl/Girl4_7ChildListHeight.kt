package height.girl

import child.ChildResult

class Girl4_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.7"

    init {
        list.add(ChildResult(102.3, 111.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.6, 102.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 97.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.3, 115.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(116.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

