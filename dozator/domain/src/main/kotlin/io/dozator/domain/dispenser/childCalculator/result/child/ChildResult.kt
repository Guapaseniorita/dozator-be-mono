package io.dozator.domain.dispenser.childCalculator.result.child

import optimal.Optimal
import org.apache.commons.lang.math.DoubleRange

class ChildResult(start: Double, end: Double) {
    val range: DoubleRange
    var message: String
        private set

    init {
        range = DoubleRange(start, end)
        message = ""
    }
    fun setNorma(age: String?, x: Optimal, typeInd: String, indicator: Double, unit: String, type: String) {
        message = """
               $typeInd$indicator$unit
               Заключение: норма
               ${setOptimal(x, age, type)}
               """.trimIndent()
    }

    fun setLowNorma(age: String?, x: Optimal, typeInd: String, indicator: Double, unit: String, type: String) {
        message = """
               $typeInd$indicator$unit
               Заключение: низкая норма
               ${setOptimal(x, age, type)}
               """.trimIndent()
    }

    fun setBelowNorm(age: String?, x: Optimal, typeInd: String, indicator: Double, unit: String, type: String) {
        message = """
               $typeInd$indicator$unit
               Заключение: ниже нормы
               ${setOptimal(x, age, type)}
               """.trimIndent()
    }

    fun setAboveNorm(age: String?, x: Optimal, typeInd: String, indicator: Double, unit: String, type: String) {
        message = """
               $typeInd$indicator$unit
               Заключение: выше нормы
               ${setOptimal(x, age, type)}
               """.trimIndent()
    }

    fun setHighNorm(age: String?, x: Optimal, typeInd: String, indicator: Double, unit: String, type: String) {
        message = """
               $typeInd$indicator$unit
               Заключение: высокая норма
               ${setOptimal(x, age, type)}
               """.trimIndent()
    }

//    fun setNorma(age: String?, x: Optimal, type: String) {
//        this.message = "Заключение: норма"
//    }
//
//    fun setLowNorma(age: String?, x: Optimal, type: String) {
//        this.message = "Заключение: низкая норма"
//
//    }
//
//    fun setBelowNorm(age: String?, x: Optimal, type: String) {
//        this.message = "Заключение: ниже нормы"
//    }
//
//    fun setAboveNorm(age: String?, x: Optimal, type: String) {
//        this.message = "Заключение: выше нормы"
//    }
//
//    fun setHighNorm(age: String?, x: Optimal, type: String) {
//        this.message = "Заключение: высокая норма"
//    }

    fun setOptimal(x: Optimal, age: String?, type: String): String? {
        return x.getRate(age, type)
    }
}