package com.home.anagrams

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class Anagram(private val filePath: String) {
    fun process() {
        val (firstWord, secondWord) = File(filePath).readLines().also {
            require(it.size == 2) {
                logger.error { "Invalid file: $filePath" }
                "Got invalid file: $filePath"
            }
        }
        writeResult(if (isAnagram(firstWord, secondWord)) 1 else 0)
    }

    private fun isAnagram(str1: String, str2: String) =
        str1.length == str2.length && str1.toCharArray().sorted() == str2.toCharArray().sorted()

    private fun writeResult(result: Int) {
        val outputFilePath = filePath.replace("input.txt", "output.txt")
        File(outputFilePath).writeText(result.toString())
        logger.info { "Output written to: $outputFilePath" }
    }
}

fun main() {
    Anagram("./task-anagrams/src/main/resources/input.txt").process()
}