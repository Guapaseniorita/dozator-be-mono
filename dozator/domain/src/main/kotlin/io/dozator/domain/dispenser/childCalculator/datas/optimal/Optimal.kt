package io.dozator.domain.dispenser.childCalculator.datas.optimal

open class Optimal {
    protected var optimal: HashMap<String, String>

    init {
        optimal = HashMap()
    }

    fun getRate(age: String, type: String): String {
        return "$type${optimal[age]}"
    }
    fun getZRate(age: String): String {
        var ageDouble: Double = age.toDouble()
        if (ageDouble <= 1.0) {
            return "Планируемая прибавка в весе: ${optimal[age]}"
        } else {
            return ""
        }
    }
}