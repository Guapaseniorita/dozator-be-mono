package height.boy

import child.ChildResult

class Boy2_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.6"

    init {
        list.add(ChildResult(88.6, 95.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(85.1, 88.5))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 85.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(95.3, 98.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


