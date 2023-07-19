package bodymassindex.girl

import child.ChildResult

class Girl0_0_2ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.2"

    init {
        list.add(ChildResult(12.3, 14.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(11.0, 12.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 10.9))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.8, 16.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


