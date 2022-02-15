package section4.datatypes

import java.math.BigDecimal


fun main(args: Array<String>) {
    var namesString = arrayOf("Jorge", "Vidal", "Alicia", "Dana")

    var namesLongs = arrayOf(1L, 2L, 3L, 4L)

    var namesLongs2 = arrayOf<Long>(1, 2, 3, 4)

    println(namesString)
    println(namesLongs)
    println(namesLongs2)

    //////////////////////////////////////////

    println(namesString[1])
    println(namesLongs[2])
    println(namesLongs2[3])

    //////////////////////////////////////////

    val evenNum = Array(16) {i -> i * 2}
    for (num in evenNum) {
        println(num)
    }

    val evenNum2 = Array(10) {i -> i+1}
    for (num in evenNum2) {
        println(num)
    }

    val evenNum3 = Array(5) {0}
    for (num in evenNum3) {
        println(num)
    }

    var evenNum4: Array<Int>
    evenNum4 = arrayOf(1,2,3,4,5)
    evenNum4 = Array(6) {i -> (i+1)*10}
    for (num in evenNum4) {
        println(num)
    }

    val mixArray = arrayOf("hello", 22, BigDecimal(12.2), 'a')
    for (element in mixArray) {
        println(element)
    }
    println(mixArray is Array<*>)
    //////////////////////////////////////////

    val myArray = intArrayOf(1,23,4,5,6,7,8,9)

    DataTypeDummy().pringSomethingFromArray(myArray)
    DataTypeDummy().pringSomethingFromArray(evenNum.toIntArray())

    //////////////////////////////////////////

    var someOther = IntArray(5)

}