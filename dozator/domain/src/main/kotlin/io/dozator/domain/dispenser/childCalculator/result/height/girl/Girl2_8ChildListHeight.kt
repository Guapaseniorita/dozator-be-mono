package height.girl

import child.ChildResult

class Girl2_8ChildListHeight(height: Double) : ChildListHeightGirl() {
    private val age = "2.8"

    init {
        list.add(ChildResult(88.7, 95.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.9, 88.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 84.8))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.8, 99.4))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(99.5, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}

