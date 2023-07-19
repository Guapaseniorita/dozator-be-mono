package height.girl

import child.ChildResult

class Girl0_0_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.7"

    init {
        list.add(ChildResult(53.9, 57.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(51.8, 53.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 51.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.8, 59.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(60.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

