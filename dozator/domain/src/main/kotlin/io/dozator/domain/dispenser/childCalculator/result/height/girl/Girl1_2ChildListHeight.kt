package height.girl

import child.ChildResult

class Girl1_2ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.2"

    init {
        list.add(ChildResult(73.8, 79.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(71.0, 73.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 70.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(79.1, 81.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

