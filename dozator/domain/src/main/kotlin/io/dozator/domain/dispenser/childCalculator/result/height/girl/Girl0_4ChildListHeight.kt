package height.girl

import child.ChildResult

class Girl0_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.4"

    init {
        list.add(ChildResult(60.0, 64.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.8, 59.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 57.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(64.3, 66.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(66.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

