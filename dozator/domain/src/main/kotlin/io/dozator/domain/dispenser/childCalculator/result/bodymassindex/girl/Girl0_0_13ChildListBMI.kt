package bodymassindex.girl

import child.ChildResult

class Girl0_0_13ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.13"

    init {
        list.add(ChildResult(15.0, 17.8))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.6, 14.9))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.5))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.9, 19.7))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.8, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


