package height.girl

import child.ChildResult

class Girl1_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.3"

    init {
        list.add(ChildResult(74.9, 80.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(72.0, 74.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 71.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.2, 83.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

