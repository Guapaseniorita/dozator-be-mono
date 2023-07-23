package io.dozator.domain.dispenser.childCalculator.datas.bodymassindex.girl

import io.dozator.domain.dispenser.childCalculator.datas.child.ChildList
import io.dozator.domain.dispenser.childCalculator.datas.optimal.Optimal
import io.dozator.domain.dispenser.childCalculator.datas.optimal.bmi.GirlBMINorma

open class ChildListBMIGirl : ChildList() {
    protected val typeInd = "Индекс массы тела: "
    protected val type = "Оптимальный индекс массы тела: "
    protected val unit = ""
    protected val optimal: Optimal = GirlBMINorma()
}