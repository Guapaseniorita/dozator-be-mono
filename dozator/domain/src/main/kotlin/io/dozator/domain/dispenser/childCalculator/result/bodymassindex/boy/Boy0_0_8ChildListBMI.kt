package bodymassindex.boy

import child.ChildResult

class Boy0_0_8ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.8"

    init {
        list.add(ChildResult(14.9, 17.5))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.6, 14.8))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.5))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.6, 19.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

