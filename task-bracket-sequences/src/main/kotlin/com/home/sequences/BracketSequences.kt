package com.home.sequences

import java.io.File
import mu.KotlinLogging

private val logger = KotlinLogging.logger { BracketSequences::class.java }

class BracketSequences(private val filePath: String) {

    fun process() {
        val n = File(filePath).readLines().first().toInt()
        val outputFilePath = filePath.replace("input.txt", "output.txt")
        val result = mutableListOf<String>()
        val resultFile = File(outputFilePath)

        fun backtrack(s: StringBuilder, left: Int, right: Int) {
            if (s.length == 2 * n) {
                result.add(s.toString())
                return
            }
            if (left < n) {
                s.append('(')
                backtrack(s, left + 1, right)
                s.deleteCharAt(s.length - 1)
            }
            if (right < left) {
                s.append(')')
                backtrack(s, left, right + 1)
                s.deleteCharAt(s.length - 1)
            }
        }

        backtrack(StringBuilder(), 0, 0)
        resultFile.writeText("")
        result.forEach { resultFile.appendText("$it\n") }

        logger.info { "Output written to: $outputFilePath" }
    }
}

fun main() {
    BracketSequences("./task-bracket-sequences/src/main/resources/input.txt").process()
}
