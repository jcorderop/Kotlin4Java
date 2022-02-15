package section7.generics

import section5.oop.Something

fun main(args: Array<String>) {
    println("--------------------------------------")
    val ints = listOf(1,2,5,36)
    convertToInt2(ints.toMutableList())
    println(ints)

    println("--------------------------------------")
    val doubles = listOf(1.5,2.9,5.45,36.1)
    convertToInt2(doubles.toMutableList())
    println(doubles)

    println("--------------------------------------")
    val short = listOf(1,2,5,36)
    convertToInt2(short.toMutableList())
    println(short)

    println("--------------------------------------")
    val short2: MutableList<Short> = mutableListOf(1,2,5,36)
    convertToInt2(short2.toMutableList())
    println(short2)
}

fun convertToInt2(list: MutableList<Number>) {
    list.forEach { println("Result: ${it.toInt()}")}
    list.add(23.3)
    println(list)
}

fun tenGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

class Garden <out T : Flower>(val something: T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int) : T = flowers[i]

    fun plantFlower(flower: @UnsafeVariance T) {

    }
}