package io.dozator.service.dispenser.vancomycin

import io.dozator.domain.Dose
import io.dozator.domain.DoseArgument
import io.dozator.domain.StringValue
import io.dozator.domain.dispenser.DispenserResult
import io.dozator.domain.dispenser.DispenserType
import io.dozator.domain.dispenser.vancomycin.*
import io.dozator.domain.dispenser.vancomycin.VancomycinChildResult.Type
import io.dozator.domain.repository.VancomycinChildRepository
import io.dozator.domain.repository.VancomycinRepository
import io.dozator.dto.request.vancomycin.VancomycinChildCalculateDoseRequest
import io.dozator.dto.response.DoseResult
import io.dozator.service.DispenserProvider
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class VancomycinChildService(
    private val repository: VancomycinChildRepository,
    private val builder: VancomycinChildResult
): DispenserProvider<VancomycinChildCalculateDoseRequest> {

    override val type: DispenserType = DispenserType.VANCOMYCIN_CHILD

    @Transactional
    override fun saveAndCalc(input: VancomycinChildCalculateDoseRequest): DoseResult {
        return VancomycinChild().run {
            indication = input.indication
            kidneyDysfunctionsGFR = input.kidneyDysfunctionsGFR
            anuria = input.anuria
            weight = input.weight
            contraindications = input.contraindications
            result = calcResult(this)
            result(repository.save(this).result)
        }
    }

    private fun calcResult(vancomycin: VancomycinChild): DispenserResult {
        with(vancomycin) {
            if (contraindications || kidneyDysfunctionsGFR?.takeIf { it < 10 } != null)
                return builder.by(Type.CONTRAINDICATED)
            if (anuria)
                return builder.by(Type.ANURIA)
            val gfrDoseValue = doseValue(kidneyDysfunctionsGFR).toFloat()
            val firstStepDoseValue = 15 * weight
            val firstStepDose = if (firstStepDoseValue <= gfrDoseValue) {
                calcStepDose(firstStepDoseValue)
            } else {
                calcStepDose(gfrDoseValue)
            }
            val secondStepDoseValue = 10 * weight
            val secondStepDose =  if (secondStepDoseValue * 2 <= gfrDoseValue) {
                calcStepDose(firstStepDoseValue)
            } else {
                calcStepDose(gfrDoseValue / 2)
            }
            val thirdStepDoseValue = 10 * weight
            val thirdStepDose =  if (thirdStepDoseValue * 3 <= gfrDoseValue) {
                calcStepDose(thirdStepDoseValue)
            } else {
                calcStepDose(gfrDoseValue / 3)
            }
            val duration = if (indication in listOf(
                Indication.BONES_AND_JOINTS_INFECTIONS,
                Indication.INFECTIVE_ENDOCARDITIS,
                Indication.SOFT_TISSUE_AND_SKIN_COMPLICATIONS_WITH_NECROSIS
            )) "4-6 недель" else "7-14 дней"
            return builder.by(
                Type.NO_ANURIA,
                DoseArgument.of(duration).build(),
                DoseArgument.of(firstStepDose[0]).unit("мг").build(),
                DoseArgument.of(firstStepDose[1]).unit("мг").build(),
                DoseArgument.of(firstStepDose[2]).unit("мл").build(),
                DoseArgument.of(secondStepDose[0]).unit("мг").build(),
                DoseArgument.of(secondStepDose[1]).unit("мг").build(),
                DoseArgument.of(secondStepDose[2]).unit("мл").build(),
                DoseArgument.of(thirdStepDose[0]).unit("мг").build(),
                DoseArgument.of(thirdStepDose[1]).unit("мг").build(),
                DoseArgument.of(thirdStepDose[2]).unit("мл").build()
            )
        }
    }

    private fun calcStepDose(doseValue: Float): IntArray {
        val ampouleWeight = if (doseValue > 500) 1000 else 500
        val injectionVolume = doseValue / ampouleWeight * 200
        return intArrayOf(doseValue.toInt(), ampouleWeight, injectionVolume.toInt())
    }
}