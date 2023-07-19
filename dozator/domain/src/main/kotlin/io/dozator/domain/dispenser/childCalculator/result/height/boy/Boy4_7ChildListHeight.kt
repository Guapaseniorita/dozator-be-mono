package height.boy

import child.ChildResult

class Boy4_7ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.7"

    init {
        list.add(ChildResult(102.9, 111.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.3, 102.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 98.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.7, 116.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(116.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


