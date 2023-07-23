package io.dozator.domain.dispenser.childCalculator.datas.weight.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal
import io.dozator.domain.dispenser.childCalculator.datas.optimal.weight.BoyWeightNorma

open class ChildListWeightBoy : ChildList() {
    protected val typeInd = "Вес: "
    protected val type = "Оптимальный вес: "
    protected val unit = " кг"
    protected val optimal: Optimal = BoyWeightNorma()
}