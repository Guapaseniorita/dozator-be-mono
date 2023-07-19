package bodymassindex.girl

import child.ChildResult

class Girl0_0_12ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.12"

    init {
        list.add(ChildResult(14.9, 17.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.5, 14.8))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.4))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.8, 19.5))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.6, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


