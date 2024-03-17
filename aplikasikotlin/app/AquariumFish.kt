package com.example.aplikasikotlin.myapp

abstract class AquariumFish(val color: String) {
    abstract fun eat()
}

class Shark: AquariumFish("grey") {
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish("gold") {
    override fun eat() {
        println("eat algae")
    }
}