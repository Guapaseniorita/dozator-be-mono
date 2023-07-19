package height.boy

import child.ChildResult

class Boy3_2ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.2"

    init {
        list.add(ChildResult(93.7, 101.1))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.8, 93.6))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 89.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(101.2, 105.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


