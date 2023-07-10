package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month2VaccineCalendarResultFactory : VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_2

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1. Третья вакцина против вирусного гепатита В группе риска.")
            .add("2. Первая вакцинация против пневмококковой инфекции.")
            .add("Должны быть сделаны:")
            .add("1. Две вакцинации против вирусного гепатита В.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Первая вакцинация против пневмококковой инфекции.")
            .add(caption = "Следующая вакцинация", description = "в 3 месяца:")
            .add("1. Первая вакцинация против дифтерии, коклюша, столбняка.")
            .add("2. Первая вакцинация против полиомиелита.")
            .add("3. Первая вакцинация против гемофильной инфекции типа b.")
}