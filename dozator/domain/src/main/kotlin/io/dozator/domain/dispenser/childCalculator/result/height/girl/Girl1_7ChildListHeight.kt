package height.girl

import child.ChildResult

class Girl1_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.7"

    init {
        list.add(ChildResult(78.9, 84.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(75.8, 78.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 75.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.7, 87.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(87.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

