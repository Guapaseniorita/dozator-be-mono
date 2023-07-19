package bodymassindex.boy

import child.ChildResult

class Boy1_1ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "1.1"

    init {
        list.add(ChildResult(15.5, 18.0))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.3, 15.4))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.2))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.1, 19.7))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.8, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

