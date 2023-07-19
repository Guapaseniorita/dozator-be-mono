package bodymassindex.girl

import child.ChildResult

class Girl0_0_1ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.1"

    init {
        list.add(ChildResult(12.0, 14.4))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(10.7, 11.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 10.6))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.5, 15.9))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.0, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


