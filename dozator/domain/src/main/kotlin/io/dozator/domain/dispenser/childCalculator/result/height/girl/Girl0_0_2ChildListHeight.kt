package height.girl

import child.ChildResult

class Girl0_0_2ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.2"

    init {
        list.add(ChildResult(49.7, 53.3))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(47.7, 49.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 47.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.4, 55.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(55.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

