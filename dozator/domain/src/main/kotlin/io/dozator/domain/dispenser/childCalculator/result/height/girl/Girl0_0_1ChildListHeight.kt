package height.girl

import child.ChildResult

class Girl0_0_1ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "0.0.1"

    init {
        list.add(ChildResult(48.5, 52.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(46.6, 48.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 46.5))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(52.2, 54.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(54.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

