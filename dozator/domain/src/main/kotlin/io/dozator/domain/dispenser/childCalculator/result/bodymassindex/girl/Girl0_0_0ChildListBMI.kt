package bodymassindex.girl

import child.ChildResult

class Girl0_0_0ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.0"

    init {
        list.add(ChildResult(12.3, 14.5))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(11.1, 12.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 11.0))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.6, 16.1))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.2, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}
