package height.girl

import child.ChildResult

class Girl2_9ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.9"

    init {
        list.add(ChildResult(89.4, 96.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.6, 89.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 85.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(96.6, 100.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(100.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

