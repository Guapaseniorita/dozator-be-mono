package height.girl

import child.ChildResult

class Girl2_1ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.1"

    init {
        list.add(ChildResult(83.4, 89.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(80.0, 83.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 79.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.9, 93.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

