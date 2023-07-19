package bodymassindex.boy

import child.ChildResult

class Boy0_0_13ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.13"

    init {
        list.add(ChildResult(15.6, 18.3))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.3, 15.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.2))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.4, 20.0))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(20.1, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

