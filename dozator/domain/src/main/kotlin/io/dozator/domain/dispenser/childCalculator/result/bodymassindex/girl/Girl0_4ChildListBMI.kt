package bodymassindex.girl

import child.ChildResult

class Girl0_4ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.4"

    init {
        list.add(ChildResult(15.3, 18.2))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(13.9, 15.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 13.8))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.3, 20.0))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(20.1, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


