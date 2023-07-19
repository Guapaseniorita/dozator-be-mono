package bodymassindex.girl

import child.ChildResult

class Girl0_0_11ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.11"

    init {
        list.add(ChildResult(14.8, 17.6))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.4, 14.7))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.3))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.7, 19.4))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.5, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


