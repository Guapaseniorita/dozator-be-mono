package bodymassindex.girl

import child.ChildResult

class Girl1_5ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "1.5"

    init {
        list.add(ChildResult(14.6, 17.2))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.4, 14.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.3))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.3, 18.9))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(19.0, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


