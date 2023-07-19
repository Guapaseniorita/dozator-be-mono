package height.girl

import child.ChildResult

class Girl4_6ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "4.6"

    init {
        list.add(ChildResult(101.7, 110.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.1, 101.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 97.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.7, 115.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(115.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

