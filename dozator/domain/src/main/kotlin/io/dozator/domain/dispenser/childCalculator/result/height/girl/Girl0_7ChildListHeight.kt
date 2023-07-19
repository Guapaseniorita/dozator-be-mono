package height.girl

import child.ChildResult

class Girl0_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.7"

    init {
        list.add(ChildResult(65.1, 69.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(62.7, 65.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 62.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(69.6, 71.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

