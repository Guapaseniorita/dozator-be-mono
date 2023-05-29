package io.dozator.common.utils.extensions

import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets

fun sha256(value: String) = Hashing.sha256()
    .hashString(
        value,
        StandardCharsets.UTF_8
    )
    .toString()

fun String.toSha256Hash() = sha256(this)

fun hmacSha256(value: String, key: String) = Hashing.hmacSha256(key.toByteArray(StandardCharsets.UTF_8))
    .hashString(
        value,
        StandardCharsets.UTF_8
    )
    .toString();

fun String.toHmacSha256Hash(key: String) = hmacSha256(this, key)
