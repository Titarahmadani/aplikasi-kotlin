package com.example.applikasikotlin

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4, 6, 8, 10]

    val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")
    val namesStartingWithA = names.filter { it.startsWith("A") }
    println(namesStartingWithA) // Output: ["Alice"]

    val scores = listOf(70, 60, 80, 90, 50, 82, 90, 91, 84, 82, 94, 99, 78, 65, 61, 45, 89, 87, 49, 76, 81, 94)
    val filteredScores = scores.filter { it >= 80 }
    println(filteredScores) // Output: [80, 90, 82, 90, 91, 84, 82, 94, 99, 89, 87, 81, 94]


}