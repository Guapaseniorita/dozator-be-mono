package bodymassindex.girl

import child.ChildResult

class Girl4_4ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "4.4"

    init {
        list.add(ChildResult(14.0, 16.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(12.8, 13.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 12.7))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.8, 18.6))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.7, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}




