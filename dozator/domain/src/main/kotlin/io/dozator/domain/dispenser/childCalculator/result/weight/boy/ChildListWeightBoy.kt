package weight.boy

import io.dozator.domain.dispenser.childCalculator.result.child.ChildList
import optimal.Optimal
import optimal.weight.BoyWeightNorma

open class ChildListWeightBoy : ChildList() {
    protected val typeInd = "Вес: "
    protected val type = "Оптимальный вес: "
    protected val unit = " кг"
    protected val optimal: Optimal = BoyWeightNorma()
}