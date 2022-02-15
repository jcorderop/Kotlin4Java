package section6.whenstatement

import java.math.BigDecimal

enum class ABCD {
    A,B,C,D
}

fun main(args: Array<String>) {
    var num = 200
    when(num) {
        100 -> println("100")
        200 -> println("200")
        300 -> println("300")
        else -> println("did not match")
    }

    //////////////////////////////////
    num = 100
    when(num) {
        100, 600 -> println("600")
        200 -> println("200")
        300 -> println("300")
        else -> println("did not match")
    }

    //////////////////////////////////
    num = 150
    var y = 50
    when(num) {
        y + 80 -> println("in range")
        y + 100 -> println("200")
        300 -> println("300")
        else -> println("did not match")
    }

    //////////////////////////////////
    num = 150
    var obj1: Any = "String"
    var obj2: Any = BigDecimal(25.5)
    var obj3: Any = 45
    var obj4: Any = obj2

    when(obj4) {
        is String -> println("is String")
        is BigDecimal -> println("is BigDecimal")
        is Int -> println("is Int")
        else -> println("did not match")
    }

    //////////////////////////////////

    val z = when(obj4) {
        is String -> {
            println("is String")
            1
        }
        is BigDecimal -> {
            println("is BigDecimal")
            2
        }
        is Int -> {
            println("is Int")
            3
        }
        else -> {
            println("did not match")
            4
        }
    }
    println(z)

    //////////////////////////////////
    val type = ABCD.C
    val str = when(type) {
        ABCD.A -> "A"
        ABCD.B -> "B"
        ABCD.C -> "C"
        ABCD.D -> "D"
    }
    println(str)

    //////////////////////////////////
    when {
        num > 100 -> println("greater")
        num < 100 -> println("less")
        num == 100 -> println("equal")
    }
}