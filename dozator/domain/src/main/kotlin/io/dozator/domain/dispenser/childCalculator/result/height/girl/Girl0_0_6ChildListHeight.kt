package height.girl

import child.ChildResult

class Girl0_0_6ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.6"

    init {
        list.add(ChildResult(53.2, 57.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(51.1, 53.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 51.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.1, 59.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(59.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

