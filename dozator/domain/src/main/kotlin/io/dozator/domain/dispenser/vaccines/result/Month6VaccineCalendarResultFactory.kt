package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month6VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_6

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1. Третья вакцинация против дифтерии, коклюша, столбняка.")
            .add("2. Третья вакцинация против вирусного гепатита B.")
            .add("3. Третья вакцинация против полиомиелита.")
            .add("4. Третья вакцинация против гемофильной инфекции типа.")
            .add("Должны быть сделаны:")
            .add("1. Две вакцинации против вирусного гепатита В и третья в группе риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Две вакцинации против пневмококковой инфекции.")
            .add("4. Первая вакцинация против пневмококковой инфекции.")
            .add("5. Две вакцинации против дифтерии, коклюша, столбняка.")
            .add("6. Две вакцинации против полиомиелита.")
            .add("7. Две вакцинации против гемофильной инфекции типа b.")
            .add(caption = "Следующая вакцинация", description = "в 12 месяцев:")
            .add("1. Вакцинация против кори, краснухи, эпидемического паротита.")
            .add("2. Четвертая вакцинация против вирусного гепатита В для группы риска.")
}