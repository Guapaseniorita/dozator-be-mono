package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Year15VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.YEAR_15

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Удобный период для наверстывающей вакцинации. Нужно только просмотреть, какие вакцины еще не были сделаны к текущему моменту.")
            .add("Должны быть сделаны:")
            .add("1. Три вакцинации против вирусного гепатита В и дополнительные две вакцинации: на 3 и 12 месяцах для группы риска.")
            .add("2. Вакцинация против туберкулеза.")
            .add("3. Две вакцинации против пневмококковой инфекции.")
            .add("4. Первая вакцинация против пневмококковой инфекции и ревакцинация против пневмококковой инфекции.")
            .add("5. Три вакцинации против дифтерии, коклюша, столбняка и первая ревакцинация против дифтерии, коклюша, столбняка, и вторая и третья ревакцинация против дифтерии, столбняка.")
            .add("6. Три вакцинации против полиомиелита и три ревакцинации против полиомиелита.")
            .add("7. Три вакцинации против гемофильной инфекции типа b и ревакцинация против гемофильной инфекции типа b.")
            .add("8. Вакцинация против кори, краснухи, эпидемического паротита.")
            .add(caption = "Следующая вакцинация", description = "см. календарь для взрослых")
            .add(caption = "К группе риска относятся", description = "дети, родившиеся от матерей - носителей HBsAg, больных вирусным гепатитом B или перенесших вирусный гепатит B в третьем триместре беременности, не имеющих результатов обследования на маркеры гепатита B, потребляющих наркотические средства или психотропные вещества, из семей, в которых есть носитель HBsAg или больной острым вирусным гепатитом B и хроническими вирусными гепатитами.", important = true)
}