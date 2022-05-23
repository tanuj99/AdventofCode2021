package day1

import java.io.File

fun printLargerThanPrevious(numbers: List<Int>) {
    println(numbers.zipWithNext { x, y -> y - x }.count { it > 0 })
}

fun modifiedMeasurements(numbers: List<Int>) {
    printLargerThanPrevious(numbers.windowed(3, 1).map { it.sum() })
}


fun main() {
    val numbers = File("src/main/kotlin/day1/input.txt").readLines().map { it.toInt() }
    printLargerThanPrevious(numbers)
    modifiedMeasurements(numbers)
}