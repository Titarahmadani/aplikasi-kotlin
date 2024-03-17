package com.example.aplikasikotlin.myapp

import java.lang.Math.PI

open class Aquarium(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    class Shark {
        val color = "grey"

        fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus {
        val color = "gold"

        fun eat() {
            println("eat algae")
        }
    }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Lebar: $width cm Panjang: $length cm Tinggi: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume liter Air: $water liter (${water / volume * 100.0}% penuh)")
    }
}

class TowerTank(
    override var height: Int,
    var diameter: Int
): Aquarium(height = height, width = diameter, length = diameter) {

    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8

    override val shape = "cylinder"
}

// Main.kt


fun main() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
