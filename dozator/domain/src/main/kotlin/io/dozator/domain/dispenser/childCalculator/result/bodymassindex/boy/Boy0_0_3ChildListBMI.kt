package bodymassindex.boy

import child.ChildResult

class Boy0_0_3ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.3"

    init {
        list.add(ChildResult(13.1, 15.5))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(11.8, 13.0))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(3.0, 11.7))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(15.6, 17.0))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(17.1, 40.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}

