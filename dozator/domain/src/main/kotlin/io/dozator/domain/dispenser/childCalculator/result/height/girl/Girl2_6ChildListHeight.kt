package height.girl

import child.ChildResult

class Girl2_6ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.6"

    init {
        list.add(ChildResult(87.2, 94.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.6, 87.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 83.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.2, 97.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

