package com.home.stone

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger { Jeweler::class.java }

class Jeweler(private val filePath: String) {

    private val lines: List<String> = File(filePath).readLines().also {
        require(it.size == 2) {
            logger.error { "Invalid file: $filePath" }
            "Got invalid file: $filePath"
        }
    }

    fun process() {
        val (j, s) = lines
        val count = s.count { it in j.toSet() }

        logger.info { "In your jewelry file: $count" }
        val outputFilePath = filePath.replace("input.txt", "output.txt")
        File(outputFilePath).writeText(count.toString())

        logger.info { "Output written to: $outputFilePath" }
    }
}

fun main() {
    Jeweler("./task-stones-decorations/src/main/resources/input.txt").process()
}