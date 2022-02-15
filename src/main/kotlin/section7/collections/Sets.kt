package section7.collections

fun main(args: Array<String>) {
    val mySet = setOf(1,2,3,4)
    println(mySet.plus(5))
    println(mySet.minus(1))
    println(mySet.average())
    println(mySet.drop(2))

    //////////////////////
    val mySet2 = mutableSetOf(1,2,3,4)
    mySet2.plus(5)
    println(mySet2)

    mySet2.add(5)
    println(mySet2)
}