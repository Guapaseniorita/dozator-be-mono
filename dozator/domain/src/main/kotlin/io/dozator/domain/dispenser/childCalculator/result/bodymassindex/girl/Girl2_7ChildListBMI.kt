package bodymassindex.girl

import child.ChildResult

class Girl2_7ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "2.7"

    init {
        list.add(ChildResult(14.4, 16.8))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.2, 14.3))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.1))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.9, 18.5))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.6, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


