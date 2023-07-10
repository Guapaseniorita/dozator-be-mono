package io.dozator.domain.dispenser.vaccines.result

import io.dozator.domain.DoseArgument
import io.dozator.domain.dispenser.Description
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultFactory
import io.dozator.domain.dispenser.vaccines.VaccineCalendarResultType
import org.springframework.stereotype.Component

@Component
class Year18VaccineCalendarResultFactory: VaccineCalendarResultFactory() {

    override val type: VaccineCalendarResultType = VaccineCalendarResultType.YEAR_18

    override fun getDescription(vararg doseArgument: DoseArgument): Description =
        Description("Правила ревакцинации для взрослых:")
            .add("1. Ревакцинация против дифтерии, столбняка - каждые 10 лет от момента последней ревакцинации.")
            .add("2. Только для женщин от 18 до 25 лет (включительно), не болевшие, не привитые, не имеющие сведений о прививках против краснухи - Вакцинация против краснухи. Привитые однократно против краснухи - Ревакцинация против краснухи.")
            .add("3. Взрослые от 18 до 35 лет (включительно), не болевшие, не привитые, не имеющие сведений о прививках против кори - Вакцинация против кори. Привитые однократно -  Ревакцинация против кори.")
            .add("4. Взрослые от 36 до 55 лет (включительно), относящиеся к группам риска (работники медицинских и организаций, осуществляющих образовательную деятельность, организаций торговли, транспорта, коммунальной и социальной сферы; лица, работающие вахтовым методом, и сотрудники государственных контрольных органов в пунктах пропуска через государственную границу Российской Федерации), не болевшие, не привитые, не имеющие сведений о прививках против кори - Вакцинация против кори. Привитые однократно - Ревакцинация против кори.")
            .add("5. Ежегодная вакцинация против гриппа.")
}