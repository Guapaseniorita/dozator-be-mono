package bodymassindex.boy

import child.ChildResult

class Boy0_10ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.10"

    init {
        list.add(ChildResult(15.8, 18.4))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.6, 15.7))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.5))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.5, 20.1))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(20.2, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

