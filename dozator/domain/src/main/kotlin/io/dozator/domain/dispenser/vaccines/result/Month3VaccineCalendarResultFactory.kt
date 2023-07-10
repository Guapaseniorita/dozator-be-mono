package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month3VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_3

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1.Первая вакцинация против дифтерии, коклюша, столбняка.")
            .add("2.Первая вакцинация против полиомиелита.")
            .add("3.Первая вакцинация против гемофильной инфекции типа b.")
            .add("Должны быть сделаны:")
            .add("1. Две вакцинации против вирусного гепатита В и третья в группе риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Первая вакцинация против пневмококковой инфекции.")
            .add(caption = "Следующая вакцинация", description = "в 4,5 месяцев:")
            .add("1. Вторая вакцинация против дифтерии, коклюша, столбняка.")
            .add("2. Вторая вакцинация против гемофильной инфекции типа b.")
            .add("3. Вторая вакцинация против полиомиелита.")
            .add("4. Вторая вакцинация против пневмококковой инфекции.")
}