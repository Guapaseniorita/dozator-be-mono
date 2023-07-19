package height.girl

import child.ChildResult

class Girl1_6ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.6"

    init {
        list.add(ChildResult(77.9, 83.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(74.9, 77.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 74.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.6, 86.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

