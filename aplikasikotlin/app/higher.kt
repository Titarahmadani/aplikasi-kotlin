package com.example.applikasikotlin

fun applyOperation(value: Int, operation: (Int) -> Int): Int {
    return operation(value)
}

fun double(number: Int) = number * 2

fun triple(number: Int) = number * 3

fun main() {
    println(applyOperation(5, ::double)) // Output: 10
    println(applyOperation(5, ::triple)) // Output: 15
}