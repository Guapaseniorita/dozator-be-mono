package height.boy

import child.ChildResult

class Boy0_0_4ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(52.5, 56.2))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(50.5, 52.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 50.4))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(56.3, 58.3))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(58.4, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
