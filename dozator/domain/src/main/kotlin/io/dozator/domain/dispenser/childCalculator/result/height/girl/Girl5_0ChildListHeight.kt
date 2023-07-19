package height.girl

import child.ChildResult

class Girl5_0ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "5.0"

    init {
        list.add(ChildResult(104.8, 114.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.9, 104.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 99.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(114.2, 118.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(119.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

