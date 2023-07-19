package height.boy

import child.ChildResult

class Boy2_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.4"

    init {
        list.add(ChildResult(87.2, 93.6))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(83.8, 87.1))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 83.7))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.7, 97.0))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.1, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


