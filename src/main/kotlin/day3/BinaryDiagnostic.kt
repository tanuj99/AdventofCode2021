package day3

import java.io.File

fun powerConsumption(list: List<String>) {
    var gamma = ""
    var epsilon = ""

    for (i in list[0].indices) {
        var ones = 0
        for (row in list) {
            if (row[i] == '1')
                ones++
        }

        gamma += if (ones > list.size / 2) "1" else "0"
        epsilon += if (ones > list.size / 2) "0" else "1"
    }

    println(gamma.toInt(2) * epsilon.toInt(2))

}


fun main() {
    val numbers = File("src/main/kotlin/day3/input.txt").readLines()
    powerConsumption(numbers)
}