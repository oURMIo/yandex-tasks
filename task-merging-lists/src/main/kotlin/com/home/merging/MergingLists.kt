package com.home.merging

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class MergingLists(private val filePath: String) {
    fun process() {
        val numbersList = mutableListOf<Int>()
        File(filePath).forEachLine { line ->
            val numbers = line.split(" ").drop(1).map { it.toInt() }
            numbersList.addAll(numbers)
        }
        val sortedNumbersList = numbersList.sorted()

        logger.debug { "numbers: $sortedNumbersList" }

        val outputFilePath = filePath.replace("input.txt", "output.txt")
        val resultFile = File(outputFilePath)
        resultFile.writeText("")
        sortedNumbersList.forEach {
            resultFile.appendText("$it ")
        }
        logger.info { "Output written to: $outputFilePath" }
    }
}

fun main() {
    MergingLists("./task-merging-lists/src/main/resources/input.txt").process()
}