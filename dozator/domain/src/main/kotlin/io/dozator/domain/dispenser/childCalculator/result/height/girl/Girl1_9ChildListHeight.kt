package height.girl

import child.ChildResult

class Girl1_9ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.9"

    init {
        list.add(ChildResult(80.7, 86.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(77.5, 80.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 77.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.7, 89.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

