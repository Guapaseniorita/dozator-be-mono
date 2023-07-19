package height.girl

import child.ChildResult

class Girl2_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.5"

    init {
        list.add(ChildResult(86.5, 93.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(82.9, 86.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 82.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.4, 96.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

