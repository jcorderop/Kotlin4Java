package section6

fun main(args: Array<String>) {
    /*val myRange = 5..5000 step 5

    for (i in myRange) {
        println(i)
    }*/

    /*
    val myRange = -500 ..   0

    for (i in myRange) {
        println(i)
    }
    */
    /*
    //Fibonacci
    val myRange = 1..13
    var sum = 0
    var before = 0
    var current = 1
    for (i in myRange) {
        sum = before+current
        before = current
        current = sum

        println("sum $sum -> current $current -> before $before")
    }
    */
    /*
    iLoop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break@iLoop
        }
        jLoop@ for (j in 11..20) {
            println(j)
            kLoop@ for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    break@jLoop
                }
            }
        }
    }
    */
    val num: Int = 19

    var dnum: Double = when {
        num > 100 -> -234.56
        num < 100 -> 44.44
        else -> 0.0
    }
    println(dnum)

}