package bodymassindex.boy

import child.ChildResult

class Boy0_0_11ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.11"

    init {
        list.add(ChildResult(15.4, 18.1))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.0, 15.3))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.9))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.2, 19.8))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.9, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

