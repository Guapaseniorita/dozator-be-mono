package height.boy

import child.ChildResult

class Boy2_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.0"

    init {
        list.add(ChildResult(84.9, 90.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.7, 84.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 81.6))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(90.9, 93.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


