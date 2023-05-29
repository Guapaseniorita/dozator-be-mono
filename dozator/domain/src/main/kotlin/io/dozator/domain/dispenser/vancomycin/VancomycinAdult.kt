package io.dozator.domain.dispenser.vancomycin

import io.dozator.domain.DoseArgument
import io.dozator.domain.DosePresenter
import io.dozator.domain.dispenser.*
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Component

@Document(NAME)
@TypeAlias(DispenserType.Constants.VANCOMYCIN_ADULT_VALUE)
class VancomycinAdult: Vancomycin(), VancomycinAdultDeclaration

@Component
class VancomycinAdultResult: DispenserResultSelector<VancomycinAdultResult.Type> {

    enum class Type { ANURIA, NO_ANURIA, CONTRAINDICATED }

    override fun by(type: Type, vararg doses: DoseArgument): DispenserResult {
        return when(type) {
            Type.ANURIA -> DefaultDispenserResult(
                name = type.name,
                dose = "Зависит от этапа лечения",
                description = Description("Таким больным следует назначать начальную дозу 15 мг/кг массы тела для быстрого создания терапевтических концентраций препарата в сыворотке.")
                    .add("Доза не должна превышать 2000 мг/сут.", caption = "Важно", important = true)
                    .add("Доза, необходимая для поддержания стабильной концентрации препарата, составляет 1.9 мг/кг/24 ч.")
                    .add("Больным с выраженной почечной недостаточностью целесообразно вводить поддерживающие дозы 250-1000 мг 1 раз в несколько дней.")
                    .add("При анурии рекомендуется доза 1 г каждые 7-10 дней.")
                    .items
            )
            Type.NO_ANURIA -> DefaultDispenserResult(
                name = type.name,
                dose = "${doses[0]}",
                description = Description("${doses[1]} внутривенно каждые 12 часов.")
                    .add("${doses[2]}", "Продолжительность")
                    .add("Разведите 1 амп ${doses[3]} на 200 мл 0,9% NaCl и введите ${doses[4]}, капельно, в течение 60 минут", "Способ разведения и введения")
                    .items
            )
            Type.CONTRAINDICATED -> DefaultDispenserResult(
                name = type.name,
                dose = "0 мг/сут",
                description = Description("Препарат противопоказан. Рассмотрите приём другого антибиотика").items
            )
        }
    }
}

