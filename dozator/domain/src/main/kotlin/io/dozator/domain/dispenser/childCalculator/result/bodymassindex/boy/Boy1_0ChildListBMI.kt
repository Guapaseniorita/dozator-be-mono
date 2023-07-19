package bodymassindex.boy

import child.ChildResult

class Boy1_0ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.0"

    init {
        list.add(ChildResult(15.6, 18.1))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.4, 15.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.3))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.2, 19.8))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.9, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

