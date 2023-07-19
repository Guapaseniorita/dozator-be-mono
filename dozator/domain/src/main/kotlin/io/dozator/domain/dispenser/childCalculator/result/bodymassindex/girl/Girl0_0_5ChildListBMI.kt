package bodymassindex.girl

import child.ChildResult

class Girl0_0_5ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.5"

    init {
        list.add(ChildResult(13.6, 16.2))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(12.2, 13.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 12.1))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.3, 17.8))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.9, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


