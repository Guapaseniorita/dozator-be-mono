package height.boy

import child.ChildResult

class Boy4_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "4.5"

    init {
        list.add(ChildResult(101.8, 110.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(97.4, 101.7))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 97.3))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(110.5, 114.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(115.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


