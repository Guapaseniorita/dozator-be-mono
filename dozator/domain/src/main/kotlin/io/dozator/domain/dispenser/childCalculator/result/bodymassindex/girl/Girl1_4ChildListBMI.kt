package bodymassindex.girl

import child.ChildResult

class Girl1_4ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "1.4"

    init {
        list.add(ChildResult(14.7, 17.3))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.5, 14.6))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.4))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.4, 19.1))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.2, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


