package bodymassindex.boy

import child.ChildResult

class Boy0_0_10ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(15.3, 17.9))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.9, 15.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.8))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.0, 19.6))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.7, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

