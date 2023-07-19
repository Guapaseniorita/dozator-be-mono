package bodymassindex.girl

import child.ChildResult

class Girl2_2ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "2.2"

    init {
        list.add(ChildResult(14.5, 16.9))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.3, 14.4))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.2))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.0, 18.7))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.8, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


