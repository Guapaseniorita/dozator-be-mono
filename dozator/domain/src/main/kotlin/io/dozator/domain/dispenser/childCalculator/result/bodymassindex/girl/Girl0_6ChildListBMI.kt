package bodymassindex.girl

import child.ChildResult

class Girl0_6ChildListBMI(bmi: Double) : ChildListBMIGirl() {
    private val age = "0.6"

    init {
        list.add(ChildResult(15.6, 18.4))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.1, 15.5))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 14.0))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(18.5, 20.3))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(20.4, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}


