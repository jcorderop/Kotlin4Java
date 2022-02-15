package section5.oop.change.javacode

class RoadBike(
    cadence: Int,
    speed: Int,
    gear: Int = 10,
    // In millimetres
    val tireWidth: Int
) : Bicycle(cadence, speed, gear) {

    override fun printPrintDescription() {
        super.printPrintDescription()
        println("with tire width of [$tireWidth]")
    }
}