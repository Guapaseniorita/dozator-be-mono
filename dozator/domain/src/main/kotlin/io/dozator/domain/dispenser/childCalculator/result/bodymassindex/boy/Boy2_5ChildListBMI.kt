package bodymassindex.boy

import child.ChildResult

class Boy2_5ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "2.5"

    init {
        list.add(ChildResult(14.8, 17.0))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.6, 14.7))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.5))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.1, 18.6))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.7, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

