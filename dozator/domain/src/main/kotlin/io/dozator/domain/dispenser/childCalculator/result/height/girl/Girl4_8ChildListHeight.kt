package height.girl

import child.ChildResult

class Girl4_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.8"

    init {
        list.add(ChildResult(102.8, 111.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.1, 102.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 98.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.9, 116.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(116.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

