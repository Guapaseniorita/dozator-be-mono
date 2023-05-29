package io.dozator.domain.dispenser.vancomycin

interface VancomycinDeclaration {
    val indication: Indication
    val kidneyDysfunctionsGFR: Int?
    val anuria: Boolean
    val contraindications: Boolean
}

interface VancomycinAdultDeclaration: VancomycinDeclaration
interface VancomycinChildDeclaration: VancomycinDeclaration {
    val weight: Float
}

enum class Indication {
    BONES_AND_JOINTS_INFECTIONS,
    INFECTIVE_ENDOCARDITIS,
    SOFT_TISSUE_AND_SKIN_COMPLICATIONS_WITH_NECROSIS,
    SOFT_TISSUE_AND_SKIN_COMPLICATIONS_WITHOUT_NECROSIS,
    COMMUNITY_ACQUIRED_PNEUMONIA,
    NOSOCOMIAL_PNEUMONIA
}

fun doseValue(gfr: Int?): Int {
    return if (gfr == null || gfr > 100) {
        2000
    } else if (gfr in 91..100) {
        1545
    } else if (gfr in 81..90) {
        1390
    } else if (gfr in 71..80) {
        1235
    } else if (gfr in 61..70) {
        1080
    } else if (gfr in 51..60) {
        925
    } else if (gfr in 41..50) {
        770
    } else if (gfr in 31..40) {
        620
    } else if (gfr in 21..30) {
        465
    } else {
        310
    }
}
