package height.girl

import child.ChildResult

class Girl3_1ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.1"

    init {
        list.add(ChildResult(92.0, 99.5))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.0, 91.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 87.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.6, 103.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(103.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

