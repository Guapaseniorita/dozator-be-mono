package bodymassindex.girl

import child.ChildResult

class Girl0_0_4ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.0.4"

    init {
        list.add(ChildResult(13.2, 15.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(11.8, 13.1))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 11.7))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(15.8, 17.4))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.5, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


