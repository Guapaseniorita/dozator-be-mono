package io.dozator.common.utils.random

import org.apache.commons.lang3.RandomStringUtils
import java.security.SecureRandom

class SecureRandomUtils {
    companion object {
        private val SECURE_RANDOM = SecureRandom()

        fun generateAlphanumericString(length: Int): String {
            return RandomStringUtils.random(length, 0, 0, true,
                true, null, SECURE_RANDOM)
        }

        fun generateNumericString(length: Int): String {
            return RandomStringUtils.random(length, 0, 0, false,
                true, null, SECURE_RANDOM)
        }
    }
}
