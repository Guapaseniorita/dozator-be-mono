package height.girl

import child.ChildResult

class Girl3_4ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.4"

    init {
        list.add(ChildResult(93.9, 101.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.8, 93.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 89.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.7, 105.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

