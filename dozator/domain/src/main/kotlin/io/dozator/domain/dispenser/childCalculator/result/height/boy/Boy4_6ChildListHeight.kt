package height.boy

import child.ChildResult

class Boy4_6ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.6"

    init {
        list.add(ChildResult(102.4, 111.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.8, 102.3))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 97.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(111.1, 115.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(115.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


