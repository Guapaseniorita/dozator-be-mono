package io.dozator.service.dispenser.vaccines

import io.dozator.domain.dispenser.DispenserResult
import io.dozator.domain.dispenser.vaccines.VaccineCalendar
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactoryProvider
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Service

@Service
class VaccineCalendarResultProvider(
    private val factoryProvider: VaccineCalendarResultFactoryProvider
) {
    fun getDispenserResult(calendar: VaccineCalendar): DispenserResult {
        val resultType = getDispenserResultType(calendar.month, calendar.year)
        return factoryProvider.getResultFactory(resultType).getDispenserResult()
    }

    private fun getDispenserResultType(month: Int, year: Int): VaccineCalendarResultType =
        when (year) {
            in Int.MIN_VALUE..0 -> when (month) {
                in Int.MIN_VALUE..1 -> VaccineCalendarResultType.MONTH_1
                2 -> VaccineCalendarResultType.MONTH_2
                3 -> VaccineCalendarResultType.MONTH_3
                in 4..5 -> VaccineCalendarResultType.MONTH_4
                6 -> VaccineCalendarResultType.MONTH_6
                else -> VaccineCalendarResultType.MONTH_7
            }
            1 -> when(month) {
                in Int.MIN_VALUE..0 -> VaccineCalendarResultType.MONTH_12
                in 1..2 -> VaccineCalendarResultType.MONTH_13
                3 -> VaccineCalendarResultType.MONTH_15
                in 4..5 -> VaccineCalendarResultType.MONTH_16
                6 -> VaccineCalendarResultType.MONTH_18
                7 -> VaccineCalendarResultType.MONTH_19
                8 -> VaccineCalendarResultType.MONTH_20
                else-> VaccineCalendarResultType.MONTH_21
            }
            in 2..5 -> VaccineCalendarResultType.MONTH_21
            6 -> VaccineCalendarResultType.YEAR_6
            7 -> VaccineCalendarResultType.YEAR_7
            in 8..13 -> VaccineCalendarResultType.YEAR_8
            14 -> VaccineCalendarResultType.YEAR_14
            in 15..17 -> VaccineCalendarResultType.YEAR_15
            else -> VaccineCalendarResultType.YEAR_18
        }
}