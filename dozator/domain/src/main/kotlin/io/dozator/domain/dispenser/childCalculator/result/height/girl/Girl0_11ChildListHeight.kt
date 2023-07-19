package height.girl

import child.ChildResult

class Girl0_11ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.11"

    init {
        list.add(ChildResult(70.4, 75.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(67.7, 70.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 67.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.3, 77.8))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(77.9, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

