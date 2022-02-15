package section7.sequences

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
    println(map)
    map.forEach{ println(it) }
    println(map.filter { it.value.startYear > 2015 }
        .map { it.value.firstName })

    println(map.asSequence().filter { it.value.startYear > 2015 }
        .map { it.value.firstName })

    println()
    ///////////////////////////////////////////////////
    println(listOf("Jorge", "Dana", "Alicia", "Vidal").asSequence()
        .filter { println("Filtering: $it"); it[0] == 'J' }
        .map { println("Map: $it"); it.uppercase() }
        .toList())

    println()
    ///////////////////////////////////////////////////
    println(listOf("Jorge", "Dana", "Alicia", "Vidal")
        .filter { println("Filtering: $it"); it[0] == 'J' }
        .map { println("Map: $it"); it.uppercase() }
        .toList())
}