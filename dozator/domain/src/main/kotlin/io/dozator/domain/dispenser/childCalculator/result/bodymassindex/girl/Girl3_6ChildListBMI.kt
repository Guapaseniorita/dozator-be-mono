package bodymassindex.girl

import child.ChildResult

class Girl3_6ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "3.6"

    init {
        list.add(ChildResult(14.1, 16.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(12.9, 14.0))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 12.8))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.8, 18.4))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.5, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


