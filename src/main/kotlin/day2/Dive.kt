package day2

import java.io.File

fun finalPosition(list: List<String>) {
    var horizontalPosition = 0
    var depth = 0

    list.forEach {
        val (direction, count) = it.split(" ")
        when (direction) {
            "forward" -> horizontalPosition += count.toInt()
            "down" -> depth += count.toInt()
            "up" -> depth -= count.toInt()
        }
    }

    println(horizontalPosition * depth)
}

fun aimedFinalPosition(list: List<String>) {
    var horizontalPos = 0
    var aim = 0
    var depth = 0

    list.forEach {
        val (direction, count) = it.split(" ")
        when (direction) {
            "forward" -> {
                horizontalPos += count.toInt()
                depth += aim * count.toInt()
            }
            "down" -> aim += count.toInt()
            "up" -> aim -= count.toInt()
        }
    }
    println(horizontalPos * depth)
}

fun main() {
    val numbers = File("src/main/kotlin/day2/input.txt").readLines()
    finalPosition(numbers)
    aimedFinalPosition(numbers)
}