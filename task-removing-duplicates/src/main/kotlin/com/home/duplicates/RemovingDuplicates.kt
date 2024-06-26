package com.home.duplicates

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger { RemovingDuplicates::class.java }

class RemovingDuplicates(private val filePath: String) {

    fun process() {
        val lines = File(filePath).readLines().drop(1).toSet()
        val outputFilePath = filePath.replace("input.txt", "output.txt")

        File(outputFilePath).writeText(lines.joinToString("\n"))

        logger.info { "Unique lines written to: $outputFilePath" }
    }
}

fun main() {
    RemovingDuplicates("./task-removing-duplicates/src/main/resources/input.txt").process()
}