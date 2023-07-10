package io.dozator.domain.dispenser

enum class DispenserType {
    VANCOMYCIN_ADULT,
    VANCOMYCIN_CHILD,

    VACCINE_CALENDAR,
    ;

    object Constants {
        const val VANCOMYCIN_ADULT_VALUE = "VANCOMYCIN_ADULT"
        const val VANCOMYCIN_CHILD_VALUE = "VANCOMYCIN_CHILD"
        const val VACCINE_CALENDAR = "VACCINE_CALENDAR"
    }
}
