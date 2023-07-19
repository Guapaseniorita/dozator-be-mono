package height.boy

import child.ChildResult

class Boy3_3ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.3"

    init {
        list.add(ChildResult(94.3, 101.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.3, 94.2))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 90.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.8, 105.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


