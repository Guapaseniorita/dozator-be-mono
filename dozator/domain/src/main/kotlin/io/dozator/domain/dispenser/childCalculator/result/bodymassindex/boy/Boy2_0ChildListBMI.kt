package bodymassindex.boy

import child.ChildResult

class Boy2_0ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "2.0"

    init {
        list.add(ChildResult(14.9, 17.2))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.8, 14.8))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.7))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.3, 18.9))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.0, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

