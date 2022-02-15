package section7.collections

fun main(args: Array<String>) {
    val strings = listOf("A", "B", "C", "D", "A")
    println(strings.last())
    println(strings.asReversed())
    println(strings.reversed())

    println(strings.getOrNull(5))

    ///////////////////////
    val ints = listOf(1,2,3,1,3,4,56,8)
    println(ints.maxOrNull())

    ///////////////////////
    println(ints.zip(strings))
    println(listOf(ints,strings))
    println(ints + strings)
    println(ints.union(strings))
    println(ints.distinct())

    val toMutable = strings.toMutableList()
    toMutable.add("Some")
    println(toMutable)
}