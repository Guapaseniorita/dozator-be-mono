package io.dozator.domain.dispenser.childCalculator.datas.headСircumference.girl


import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal
import optimal.headcirc.GirlHeadCircNorma

open class ChildListHeadCircGirl : ChildList() {
    protected val typeInd = "Окружность головы: "
    protected val type = "Оптимальная окружность головы: "
    protected val unit = " см"
    protected val optimal: Optimal = GirlHeadCircNorma()
}