package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month4VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_4

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1. Вторая вакцинация против дифтерии, коклюша, столбняка.")
            .add("2. Вторая вакцинация против гемофильной инфекции типа b.")
            .add("3. Вторая вакцинация против полиомиелита.")
            .add("4. Вторая вакцинация против пневмококковой инфекции.")
            .add("Должны быть сделаны:")
            .add("1. Две вакцинации против вирусного гепатита В и третья в группе риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Первая вакцинация против пневмококковой инфекции.")
            .add("4. Первая вакцинация против дифтерии, коклюша, столбняка.")
            .add("5. Первая вакцинация против полиомиелита.")
            .add("6. Первая вакцинация против гемофильной инфекции типа b.")
            .add(caption = "Следующая вакцинация", description = "в 6 месяцев:")
            .add("1. Третья вакцинация против дифтерии, коклюша, столбняка.")
            .add("2. Третья вакцинация против вирусного гепатита B.")
            .add("3. Третья вакцинация против полиомиелита.")
            .add("4. Третья вакцинация против гемофильной инфекции типа b.")
}