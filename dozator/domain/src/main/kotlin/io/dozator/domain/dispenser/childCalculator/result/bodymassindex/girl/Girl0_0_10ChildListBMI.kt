package bodymassindex.girl

import child.ChildResult

class Girl0_0_10ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.10"

    init {
        list.add(ChildResult(14.7, 17.4))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.2, 14.6))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.1))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.5, 19.2))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.3, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


