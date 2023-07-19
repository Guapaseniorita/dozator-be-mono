package bodymassindex.boy

import child.ChildResult

class Boy2_9ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "2.9"

    init {
        list.add(ChildResult(14.6, 16.9))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.5, 14.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.4))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.0, 18.5))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.6, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

