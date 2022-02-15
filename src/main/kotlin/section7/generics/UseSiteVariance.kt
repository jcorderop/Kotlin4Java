package section7.generics

import javax.print.attribute.standard.Destination

fun main(args: Array<String>) {

    val cars1 = mutableListOf(Car(), Car(), Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1,cars2)
    println(cars2)
    println("-------------------------------")

    val cars1Ford = mutableListOf(Ford(), Ford(), Ford(), Ford())
    val cars2Ford: MutableList<Ford> = mutableListOf()
    copyCars(cars1Ford, cars2Ford)
    println(cars2Ford)
    println("-------------------------------")

    val cars3: MutableList<Ford> = mutableListOf(Ford(), Ford(), Ford(), Ford())
    val cars3Ford: MutableList<Car> = mutableListOf()
    copyCars(cars3, cars3Ford)
    println(cars2Ford)

    println("-------------------------------")

    val cars4: MutableList<Car> = mutableListOf(Ford(), Ford(), Ford(), Ford())
    val cars4Ford: MutableList<Ford> = mutableListOf()
    //copyCars2(cars4, cars4Ford)
    println(cars2Ford)
}

fun <T> copyCars (source: MutableList<out T>, destination: MutableList<T>) {
    for (element in source) {
        destination.add(element)
    }
}

fun <T> copyCars2 (source: MutableList<T>, destination: MutableList<in T>) {
    for (element in source) {
        destination.add(element)
    }
}

open class Car {

}

class Toyota: Car () {

}

class Ford: Car () {

}