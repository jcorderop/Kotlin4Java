package section7.collections

import section5.oop.EmployeeKotlinSimple

fun main(args: Array<String>) {
    //immutable
    val map = mapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )

    println(map.javaClass)
    map.forEach{ println(it) }

    ///////////////////////////////
    //mutable
    val map2 = mutableMapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )
    println(map2.javaClass)
    map2.forEach{ println(it) }

    //hashMap
    val map3 = hashMapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )
    println(map3.javaClass)
    map3.forEach{ println(it) }

    for (entry in map3) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in map3) {
        println(key)
        println(value)
    }

    ////////////////////////////////////////
    val pair1 = Pair(10, "ten")
    val pair2 = Pair(1, "one")
    println(pair1)
    println(pair2)
    val (firstPart, secondPart) = pair1
    println(firstPart)
    println(secondPart)

    ////////////////////////////////

    val (name, year) = EmployeeKotlinSimple ("Jorge",  2012)
    println(name)
    println(year)
}