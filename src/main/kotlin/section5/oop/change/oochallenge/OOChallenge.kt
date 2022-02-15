package academy.learnprogramming.oochallenge

import section5.oop.change.javacode.Bicycle
import section5.oop.change.javacode.MountainBike
import section5.oop.change.javacode.RoadBike

fun main(args: Array<String>) {
    Bicycle(8, 15, 1).printPrintDescription()
    MountainBike(10, 15, 40, 5).printPrintDescription()
    RoadBike(13, 60, 12, 5).printPrintDescription()

    println()
    //////////////////////////////////
    Bicycle(8, 15, ).printPrintDescription()
    MountainBike(10, 15, 40).printPrintDescription()
    RoadBike(cadence = 5, speed = 60, tireWidth = 5).printPrintDescription()

    println()
    //////////////////////////////////
    MountainBike(seatHeight = 14, cadence = 45, speed = 40, color = Bicycle.colorsAvailable.get(1)).printPrintDescription()
}


