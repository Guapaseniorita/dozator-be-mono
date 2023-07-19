package bodymassindex.girl

import child.ChildResult

class Girl1_9ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "1.9"

    init {
        list.add(ChildResult(14.4, 16.9))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.2, 14.3))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.1))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.0, 18.6))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.7, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


