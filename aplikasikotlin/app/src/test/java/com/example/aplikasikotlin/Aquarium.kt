package com.example.aplikasikotlin.myapp

class aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    interface FishAction  {
        fun eat()
    }

    interface FishColor {
        val color: String
    }


    class Shark: FishAction, FishColor {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    object GoldColor : FishColor {
        override val color = "gold"
    }

    class plecostomus:  FishAction, FishColor by GoldColor {
        override fun eat() {
            println("eat algae")
        }
    }

    class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
        FishColor by fishColor {
        override fun eat() {
            println("eat algae")
        }
    }

    abstract class AquariumFish(val color: String) {
        abstract fun eat()
    }

    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println(food)
        }
    }

    class Plecostomuss (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

}
