package io.dozator.service.dispenser.vancomycin

import io.dozator.domain.Dose
import io.dozator.domain.DoseArgument
import io.dozator.domain.StringValue
import io.dozator.domain.dispenser.DispenserResult
import io.dozator.domain.dispenser.DispenserType
import io.dozator.domain.dispenser.vancomycin.*
import io.dozator.domain.dispenser.vancomycin.VancomycinAdultResult.Type
import io.dozator.domain.repository.VancomycinAdultRepository
import io.dozator.domain.repository.VancomycinRepository
import io.dozator.dto.request.vancomycin.VancomycinAdultCalculateDoseRequest
import io.dozator.dto.response.DoseResult
import io.dozator.service.DispenserProvider
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class VancomycinAdultService(
    private val repository: VancomycinAdultRepository,
    private val builder: VancomycinAdultResult
): DispenserProvider<VancomycinAdultCalculateDoseRequest> {

    override val type: DispenserType = DispenserType.VANCOMYCIN_ADULT

    @Transactional
    override fun saveAndCalc(input: VancomycinAdultCalculateDoseRequest): DoseResult {
        return VancomycinAdult().run {
            indication = input.indication
            kidneyDysfunctionsGFR = input.kidneyDysfunctionsGFR
            anuria = input.anuria
            contraindications = input.contraindications
            result = calcResult(this)
            result(repository.save(this).result)
        }
    }

    private fun calcResult(vancomycin: VancomycinAdult): DispenserResult {
        with(vancomycin) {
            if (contraindications || kidneyDysfunctionsGFR?.takeIf { it < 10 } != null)
                return builder.by(Type.CONTRAINDICATED)
            if (anuria)
                return builder.by(Type.ANURIA)
            val gfrDoseValue = doseValue(kidneyDysfunctionsGFR)
            val ampouleWeight = if (gfrDoseValue > 500) 1000 else 500
            val gfrDose = calcStepDose(gfrDoseValue, ampouleWeight)

            val duration = if (indication in listOf(
                Indication.BONES_AND_JOINTS_INFECTIONS,
                Indication.INFECTIVE_ENDOCARDITIS,
                Indication.SOFT_TISSUE_AND_SKIN_COMPLICATIONS_WITH_NECROSIS
            )) "4-6 недель" else "7-14 дней"
            return builder.by(
                Type.NO_ANURIA,
                DoseArgument.of(gfrDose[0]).unit("мг").build(),
                DoseArgument.of(gfrDose[1]).unit("мг").build(),
                DoseArgument.of(duration).build(),
                DoseArgument.of(gfrDose[2]).unit("мг").build(),
                DoseArgument.of(gfrDose[3]).unit("мл").build()
            )
        }
    }

    private fun calcStepDose(doseValue: Int, ampouleWeight: Int): IntArray {
        val doseHalf = doseValue / 2f
        val injectionVolume = doseHalf / ampouleWeight * 200
        return intArrayOf(doseValue, doseHalf.toInt(), ampouleWeight, injectionVolume.toInt())
    }
}