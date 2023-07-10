package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month7VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_7

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Удобный период для наверстывающей вакцинации. Нужно только просмотреть, какие вакцины еще не были сделаны к текущему моменту.")
            .add("Должны быть сделаны до 6 месяцев включительно:")
            .add("1. Три вакцинации против вирусного гепатита В и еще одна вакцинация на 3 месяце для группы риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Две вакцинации против пневмококковой инфекции.")
            .add("4. Первая вакцинация против пневмококковой инфекции.")
            .add("5. Три вакцинации против дифтерии, коклюша, столбняка.")
            .add("6. Три вакцинации против полиомиелита.")
            .add("7. Три вакцинации против гемофильной инфекции типа b.")
            .add(caption = "Следующая вакцинация", description = "в 12 месяцев")
            .add("1. Вакцинация против кори, краснухи, эпидемического паротита.")
            .add("2. Четвертая вакцинация против вирусного гепатита В для группы риска.")
}