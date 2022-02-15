package section6.ifs

fun main(args: Array<String>) {
    var num: Int

    var something = true

    if (something) {
        num = 20
    } else {
        num = 30
    }
    println(num)

    num = if (something) 50 else 30
    println(num)

    num = if (something) {
        200 //return
    } else {
        300
    }
    println(num)

    println("result: ${if (something) {
        println("something")
        2000 //return
    } else {
        println("something else")
        3000
    }
    }")
}