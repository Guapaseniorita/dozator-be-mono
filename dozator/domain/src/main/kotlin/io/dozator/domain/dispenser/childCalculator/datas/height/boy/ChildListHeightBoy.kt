package io.dozator.domain.dispenser.childCalculator.datas.height.boy


import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.height.BoyHeightNorma
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal

open class ChildListHeightBoy : ChildList() {
    protected val typeInd = "Рост: "
    protected val type = "Оптимальный рост: "
    protected val unit = " см"
    protected val optimal: Optimal = BoyHeightNorma()
}