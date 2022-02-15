package section5.oop.change.javacode

import kotlin.reflect.KClass

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    companion object {
        val colorsAvailable = arrayListOf<String>("Red","Blue","Yellow").toList()
    }

    open fun printPrintDescription() = println("${Bicycle::class.java.simpleName} Bike is in gear [$gear]," +
            " with a cadence of [$cadence], with a speed of [$speed]")
}