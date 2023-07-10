package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month12VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_12

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1. Вакцинация против кори, краснухи, эпидемического паротита.")
            .add("2. Четвертая вакцинация против вирусного гепатита В для группы риска.")
            .add("Должны быть сделаны:")
            .add("1. Три вакцинации против вирусного гепатита В и еще одна вакцинация  на 3 месяце для группы риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Две вакцинации против пневмококковой инфекции.")
            .add("4. Первая вакцинация против пневмококковой инфекции.")
            .add("5. Три вакцинации против дифтерии, коклюша, столбняка.")
            .add("6. Три вакцинации против полиомиелита.")
            .add("7. Три вакцинации против гемофильной инфекции типа b.")
            .add(caption = "Следующая вакцинация", description = "в 15 месяцев:")
            .add("1. Ревакцинация против пневмококковой инфекции.")
}