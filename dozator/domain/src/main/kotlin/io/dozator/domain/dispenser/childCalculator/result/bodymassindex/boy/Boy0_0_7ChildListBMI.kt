package bodymassindex.boy

import child.ChildResult

class Boy0_0_7ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.7"

    init {
        list.add(ChildResult(14.7, 17.3))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.3, 14.6))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.2))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.4, 18.9))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.0, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

