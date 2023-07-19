package height.boy

import child.ChildResult

class Boy1_11ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "1.11"

    init {
        list.add(ChildResult(84.0, 89.8))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(81.0, 83.9))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 80.9))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(89.9, 92.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(93.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


