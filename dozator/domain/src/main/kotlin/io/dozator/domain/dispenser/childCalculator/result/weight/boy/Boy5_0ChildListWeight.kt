package weight.boy



import io.dozator.domain.dispenser.childCalculator.result.child.ChildResult

class Boy5_0ChildListWeight(weight: Double) : ChildListWeightBoy() {
    private val age = "5.0"

    init {
        list.add(ChildResult(16.1, 20.9))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(14.1,16.0))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0,14.0))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(21.0,24.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(24.3, 60.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}
