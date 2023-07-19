package height.boy

import child.ChildResult

class Boy2_5ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "2.5"

    init {
        list.add(ChildResult(87.9, 94.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(84.5, 87.8))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 84.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(94.5, 97.9))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(98.0, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}


