package io.dozator.domain.dispenser.childCalculator.datas.weight.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.weight.GirlWeightNorma
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal

open class ChildListWeightGirl : ChildList() {
    protected val typeInd = "Вес: "
    protected val type = "Оптимальный вес: "
    protected val unit = " кг"
    protected val optimal: Optimal = GirlWeightNorma()

}