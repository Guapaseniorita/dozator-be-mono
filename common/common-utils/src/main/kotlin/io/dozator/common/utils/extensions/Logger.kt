package io.dozator.common.utils.extensions

import ch.qos.logback.classic.Level
import com.google.common.base.Stopwatch
import org.slf4j.Logger
import org.slf4j.LoggerFactory

fun <T : Any> T.logger(): Logger {
    val clazz = when {
        this::class.isCompanion -> javaClass.enclosingClass
        else -> javaClass
    }
    return LoggerFactory.getLogger(clazz)
}

fun turnOffLogger(name: String) {
    val logger = LoggerFactory.getLogger(name) as? ch.qos.logback.classic.Logger
    logger?.let { it.level = Level.OFF }
}

inline fun <R> stopwatch(logger: (String) -> Unit, blockName: String, block: () -> R): R {
    logger("$blockName started.")
    val stopwatch = Stopwatch.createStarted()
    var ex: Throwable? = null
    return try {
        block()
    } catch (e: Throwable) {
        logger("$blockName failed.")
        ex = e
        throw e
    } finally {
        // for block local return statement
        if (ex == null) {
            logger("$blockName completed. It took ${stopwatch.stop()}.")
        }
    }
}
