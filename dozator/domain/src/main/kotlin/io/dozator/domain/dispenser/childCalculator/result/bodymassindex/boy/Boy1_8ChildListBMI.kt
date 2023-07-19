package bodymassindex.boy

import child.ChildResult

class Boy1_8ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.8"

    init {
        list.add(ChildResult(14.9, 17.2))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.7, 14.8))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.6))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.3, 18.8))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.9, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

