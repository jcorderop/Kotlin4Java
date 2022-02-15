package section7.collections

import section5.oop.EmployeeKotlinSimple

fun main(args: Array<String>) {

    val set = setOf(345, 155,254,353)
    println(set.filter { it % 2 == 0 })
    println("----------------------------")

    ///////////////////////////////
    //mutable
    val map2 = mutableMapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )
    println(map2.filter{ it.value.startYear >= 2018 })
    val map2_1 = map2.filter{ it.value.startYear >= 2018 }
    println(map2)
    println(map2_1)
    println()

    println("----------------------------")
    //mutable
    val map3 = mutableMapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )
    println(map3.filter{ it.value.startYear >= 2018 })
    val map3_1 = map3.filter{ it.value.startYear >= 2018 }
    println(map3)
    println(map3_1)
    println()

    println("----------------------------")
    //hashMap
    val map4 = hashMapOf (
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        3 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2019)
    )
    println(map4.filter{ it.value.startYear >= 2018 })
    val map4_1 = map4.filter{ it.value.startYear >= 2018 }
    println(map4)
    println(map4_1)
    println()

    ////////////////////////////////////////////////
    println("----------------------------")
    val maps = setOf(1,2,3,4,5)
    val maps_1 = maps.map { it + 10 }
    println(maps_1)

    //mutable
    val map5 = mutableMapOf(
        1 to EmployeeKotlinSimple ("Jorge",  2012),
        2 to EmployeeKotlinSimple("Vidal", 2018),
        31 to EmployeeKotlinSimple("Dana", 2017),
        4 to EmployeeKotlinSimple("Alicia", 2018)
    )
    val years = map5.map { it.value.startYear }
    println(years)

    println("----------------------------")
    val mapFilter = map5.filter { it.value.startYear > 2015 }
        .map { it.value.firstName}
    println(mapFilter)

    ////////////////////////////////////////////////
    println("----------------------------")
    println(map5.any({ it.value.startYear > 2015 }))
    println(map5.count({ it.value.startYear > 2015 }))

    println(map5.map({ it.value.startYear }).find { it.equals(2018) })

    println(map5.values.groupBy { it.startYear })

    println(map5.toSortedMap())

}