package bodymassindex.girl

import child.ChildResult

class Girl2_9ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "2.9"

    init {
        list.add(ChildResult(14.3, 16.8))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.1, 14.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.0))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.9, 18.5))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.6, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

