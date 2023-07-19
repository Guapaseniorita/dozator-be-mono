package bodymassindex.boy

import child.ChildResult

class Boy3_10ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "3.10"

    init {
        list.add(ChildResult(14.3, 16.6))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.1, 14.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.0))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.7, 18.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

