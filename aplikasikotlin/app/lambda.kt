package com.example.applikasikotlin

fun main() {
    println(waterFilter(dirtLevel))
}
var dirtLevel = 65
val filterStrength = 30
val waterFilter = {level: Int -> (level + filterStrength * 2 / 25)

}