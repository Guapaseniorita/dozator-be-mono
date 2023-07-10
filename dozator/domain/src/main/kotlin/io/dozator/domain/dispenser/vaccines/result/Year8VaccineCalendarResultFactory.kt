package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Year8VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.YEAR_8

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Удобный период для наверстывающей вакцинации. Нужно только просмотреть, какие вакцины еще не были сделаны к текущему моменту.")
            .add("Должны быть сделаны:")
            .add("1. Три вакцинации против вирусного гепатита В и дополнительные две вакцинации: на 3 и 12 месяцах для группы риска.")
            .add("2. Вакцинация против туберкулеза и ревакцинация против туберкулеза.")
            .add("3. Две вакцинации против пневмококковой инфекции.")
            .add("4. Первая вакцинация против пневмококковой инфекции и ревакцинация против пневмококковой инфекции.")
            .add("5. Три вакцинации против дифтерии, коклюша, столбняка и первая ревакцинация против дифтерии, коклюша, столбняка, и вторая ревакцинация против дифтерии, столбняка.")
            .add("6. Три вакцинации против полиомиелита и три ревакцинации против полиомиелита.")
            .add("7. Три вакцинации против гемофильной инфекции типа b и ревакцинация против гемофильной инфекции типа b.")
            .add("8. Вакцинация против кори, краснухи, эпидемического паротита.")
            .add(caption = "Следующая вакцинация", description = "в 14 лет:")
            .add("1. Третья ревакцинация против дифтерии, столбняка.")
}