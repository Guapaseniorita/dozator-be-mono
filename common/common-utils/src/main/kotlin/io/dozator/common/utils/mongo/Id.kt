package io.dozator.common.utils.mongo

fun epochFromObjectId(objectId: String): Long {
    return if (objectId.length > 8) {
        Integer.decode("0x" + objectId.substring(0, 8)).toLong()
    } else {
        0
    }
}