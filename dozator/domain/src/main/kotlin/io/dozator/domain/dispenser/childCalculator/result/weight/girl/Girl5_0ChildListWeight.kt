package weight.girl

import child.ChildResult

class Girl5_0ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "5.0"

    init {
        list.add(ChildResult(15.9, 21.1))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(13.7, 15.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 13.6))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(21.2, 24.9))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(25.9, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

