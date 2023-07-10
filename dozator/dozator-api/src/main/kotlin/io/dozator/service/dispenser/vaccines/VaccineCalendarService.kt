package io.dozator.service.dispenser.vaccines

import io.dozator.domain.dispenser.DispenserType
import io.dozator.domain.dispenser.vaccines.VaccineCalendar
import io.dozator.domain.repository.VaccineCalendarRepository
import io.dozator.dto.request.vaccines.VaccineCalendarCalculateDoseRequest
import io.dozator.dto.response.DoseResult
import io.dozator.service.DispenserProvider
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class VaccineCalendarService(
    private val repository: VaccineCalendarRepository,
    private val resultProvider: VaccineCalendarResultProvider
) : DispenserProvider<VaccineCalendarCalculateDoseRequest> {

    override val type: DispenserType = DispenserType.VACCINE_CALENDAR

    @Transactional
    override fun saveAndCalc(input: VaccineCalendarCalculateDoseRequest): DoseResult {
        val calendar = VaccineCalendar()
        calendar.day = input.day
        calendar.month = input.month
        calendar.year = input.year
        calendar.result = resultProvider.getDispenserResult(calendar)
        return result(repository.save(calendar).result)
    }
}