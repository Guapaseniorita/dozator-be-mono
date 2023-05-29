package io.dozator.domain

import io.dozator.common.utils.exceptions.StatusException
import java.time.OffsetDateTime

//todo common
interface HasStatus<S> : Updatable {
    var status: S
}

fun <S, T : HasStatus<S>> T.verifyStatus(expected: S): T {
    if(status != expected) {
        throw StatusException.WrongStatus("Expected status: $expected. Actual: $status")
    }

    return this
}

fun <S, T : HasStatus<S>> T.transit(from: Set<S>, to: S): T {
    if (status !in from) {
        throw StatusException.WrongTransition("Can transit $this to $to only from $from status, current: $status")
    }
    status = to
    updated = OffsetDateTime.now()
    return this
}

fun <S, T : HasStatus<S>> T.transit(from: S, to: S): T {
    if (status != from) {
        throw StatusException.WrongTransition("Can transit $this to $to only from $from status, current: $status")
    }
    status = to
    updated = OffsetDateTime.now()
    return this
}
