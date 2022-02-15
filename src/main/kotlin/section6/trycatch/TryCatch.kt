package section6.trycatch

import java.lang.Exception

fun main(args: Array<String>) {
    println(getNumber("25"))
    println(getNumber3("2x"))
    println(getNumber2("2x") ?: "Something when wrong...")
    try {
        println(getNumber2("25.2") ?: throw IllegalArgumentException("No valid number"))
    } catch (e: Exception) {
        println("I knew...")
    }
    try {
        println(getNumber4("2x"))
    } catch (e: Exception) {
        println("bad...")
    }

    returnNothing()
}

fun returnNothing():Nothing {
    println("return nothing")
    throw IllegalArgumentException("Implement me...")
}

fun getNumber (str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("finally")
        7 // not involved
    }
}
fun getNumber2 (str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("finally")
    }
}

fun getNumber3 (str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("finally")
    }
}

fun getNumber4 (str: String): Int {
    return try {
        Integer.parseInt(str)
    } finally {
        println("finally")
    }
}
