package height.boy

import child.ChildResult

class Boy3_8ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "3.8"

    init {
        list.add(ChildResult(97.1, 105.0))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.0, 97.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 92.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(105.1, 109.1))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(109.2, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


