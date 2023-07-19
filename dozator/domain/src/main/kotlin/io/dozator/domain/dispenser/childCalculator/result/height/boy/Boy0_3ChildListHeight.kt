package height.boy

import child.ChildResult
import height.boy.ChildListHeightBoy

class Boy0_3ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.3"

    init {
        list.add(ChildResult(59.5, 63.4))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(57.3, 59.4))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 57.2))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(63.5, 65.5))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(65.6, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}
