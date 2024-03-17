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

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Lebar: $width cm " +
                "Panjang: $length cm " +
                "Tinggi: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume liter Air: $water liter (${water / volume * 100.0}% penuh)")
    }
}

fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}
