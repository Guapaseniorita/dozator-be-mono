package io.dozator.domain.dispenser.childCalculator.datas.height.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.height.GirlHeightNorma
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal


open class ChildListHeightGirl : ChildList() {
    protected val typeInd = "Рост: "
    protected val type = "Оптимальный рост: "
    protected val unit = " см"
    protected val optimal: Optimal = GirlHeightNorma()
}