package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.boy

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.headcirc.BoyHeadCircNorma
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal


open class ChildListHeadCircBoy : ChildList() {
    protected val typeInd = "Окружность головы: "
    protected val type = "Оптимальная окружность головы: "
    protected val unit = " см"
    protected val optimal: Optimal = BoyHeadCircNorma()
}