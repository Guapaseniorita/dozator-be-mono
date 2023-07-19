package height.girl

import child.ChildResult

class Girl2_7ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.7"

    init {
        list.add(ChildResult(88.0, 94.9))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.3, 87.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 84.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.0, 98.6))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.7, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

