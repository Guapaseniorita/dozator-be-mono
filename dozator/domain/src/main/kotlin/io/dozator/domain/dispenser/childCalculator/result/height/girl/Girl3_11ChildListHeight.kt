package height.girl

import child.ChildResult

class Girl3_11ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "3.11"

    init {
        list.add(ChildResult(98.0, 106.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.6, 97.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 93.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(106.4, 110.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

