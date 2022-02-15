package section5.oop.change.javacode

class MountainBike(
    var seatHeight: Int,
    cadence: Int,
    speed: Int,
    gear: Int = 10
) : Bicycle(cadence, speed, gear) {

    var color: String = "None"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(seatHeight: Int,
                cadence: Int,
                speed: Int,
                gear: Int = 10,
                color: String) : this(seatHeight, cadence, speed, gear) {
        this.color = color
    }

    override fun printPrintDescription() {
        super.printPrintDescription()
        println("with seat height of [$seatHeight] and color [$color]")
    }
}