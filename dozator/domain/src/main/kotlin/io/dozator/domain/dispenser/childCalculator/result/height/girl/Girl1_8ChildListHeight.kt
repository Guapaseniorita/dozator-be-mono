package height.girl

import child.ChildResult

class Girl1_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "1.8"

    init {
        list.add(ChildResult(79.8, 85.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(76.7, 79.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 76.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.7, 88.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(88.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

