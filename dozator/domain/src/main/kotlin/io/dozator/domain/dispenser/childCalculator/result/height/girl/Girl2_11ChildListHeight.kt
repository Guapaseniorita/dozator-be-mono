package height.girl

import child.ChildResult

class Girl2_11ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.11"

    init {
        list.add(ChildResult(90.7, 98.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(86.8, 90.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 86.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.1, 101.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(102.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

