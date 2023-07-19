package height.girl

import child.ChildResult

class Girl3_3ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.3"

    init {
        list.add(ChildResult(93.2, 100.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.2, 93.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 89.1))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.0, 105.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

