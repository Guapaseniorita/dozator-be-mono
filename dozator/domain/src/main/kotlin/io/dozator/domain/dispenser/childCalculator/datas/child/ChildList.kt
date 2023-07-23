package io.dozator.domain.dispenser.childCalculator.datas.child

open class ChildList {
    val list: ArrayList<ChildResult>

    init {
        list = ArrayList()
    }

    fun getList(): List<ChildResult> {
        return list
    }
}