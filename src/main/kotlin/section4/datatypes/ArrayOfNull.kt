package section4.datatypes

fun main(args: Array<String>) {
    var nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[4].toString())
}