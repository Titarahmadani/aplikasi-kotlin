package com.example.applikasikotlin

fun main() {
    println(isTooHot(temperature = 100))
    println(isTooHot(temperature = 50))
}

fun isTooHot(temperature: Int): Boolean {
    return temperature > 90
}