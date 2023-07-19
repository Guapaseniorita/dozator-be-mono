package bodymassindex.boy

import child.ChildResult

class Boy0_8ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.8"

    init {
        list.add(ChildResult(16.0, 18.6))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.7, 15.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.6))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.7, 20.4))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(20.5, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

