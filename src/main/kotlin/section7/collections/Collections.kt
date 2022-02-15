package section7.collections

import java.util.*

fun main(args: Array<String>) {

    val strings = listOf("A", "B", "C", "D")
    println(strings.javaClass)

    val empty = emptyArray<String>()
    println(empty.javaClass)

    val notNull = listOfNotNull("hallo", null, "goodbye")
    println(notNull)

    val arrayList = arrayListOf("hallo", "goodbye")
    println(arrayList.javaClass)

    val mutableList = mutableListOf(3, 1,2,3)
    println(mutableList.javaClass)

    println(mutableList[2])
    mutableList[2]=5
    println(mutableList[2])

    println(mutableList.get(2))
    mutableList.set(2,15)
    println(mutableList.get(2))

    val array = arrayOf(3, 1,2,3)
    val converted = listOf(*array)
    println(converted)
    println(converted.javaClass)

    val converted2 = mutableList.toList()
    println(converted2)
    println(converted2.javaClass)

    //java
    val converted3 = intArrayOf()
    println(converted3)
    println(converted3.javaClass)
}