package com.home.consecutive

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger { ConsecutiveUnits::class.java }

class ConsecutiveUnits(private val filePath: String) {

    fun process() {
        val lines = File(filePath).readLines()
        var maxLength = 0
        var currentLength = 0

        lines.drop(1).map { it.toInt() }.forEach { num ->
            if (num == 1) {
                currentLength++
                maxLength = maxOf(maxLength, currentLength)
            } else {
                currentLength = 0
            }
        }

        logger.info { "Maximum consecutive length of 1s: $maxLength" }

        val outputFilePath = filePath.replace("input.txt", "output.txt")
        File(outputFilePath).writeText(maxLength.toString())

        logger.info { "Output written to: $outputFilePath" }
    }
}

fun main() {
    ConsecutiveUnits("./task-consecutive-units/src/main/resources/input.txt").process()
}
