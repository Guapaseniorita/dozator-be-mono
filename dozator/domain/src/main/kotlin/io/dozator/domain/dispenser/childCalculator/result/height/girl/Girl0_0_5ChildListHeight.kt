package height.girl

import child.ChildResult

class Girl0_0_5ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.5"

    init {
        list.add(ChildResult(52.4, 56.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(50.3, 52.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 50.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.2, 58.2))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(58.3, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

