package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Month1VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.MONTH_1

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Какие вакцины нужно сделать:")
            .add("1. Первая вакцина против гепатита B срок: в первые 24 часа жизни.")
            .add("2. БЦЖ срок: 3-7 день.")
            .add("3. Вторая вакцина против гепатита B срок: конец первого месяца.")
            .add(caption = "Следующая вакцинация", description = "в 2 месяца:")
            .add("1. Третья вакцина от вирусного гепатита B (только для группы риска).")
            .add("2. Первая вакцинация против пневмококковой инфекции.")
}