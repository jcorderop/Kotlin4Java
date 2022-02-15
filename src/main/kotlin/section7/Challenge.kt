package section7

fun main(args: Array<String>) {
    ///////////////////////////////// data
    val joe1 = Person("Joe1", "Jones1", 23)
    val (firstName, lastName, age) = joe1
    println("$firstName, $lastName with age: $age")

    //////////////////////////////// operator component
    val joe2 = Person2("Joe2", "Jones2", 35)
    val (firstName2, lastName2, age2) = joe2
    println("$firstName2, $lastName2 with age: $age2")

    val joe3 = Person("Joe3", "Jones3", 48)
    val joe4 = Person("Joe4", "Jones4", 81)
    val joe5 = Person("Joe5", "Jones5", 34)

    val people = mapOf(joe1.lastName to joe1,
        joe3.lastName to joe3,
        joe4.lastName to joe4,
        joe5.lastName to joe5)
    println(people)

    /////////////////////////////// filter
    println(people.filter { it.value.age > 50})

    /////////////////////////////// pair
    println(people.map { Pair(it.value.firstName, it.value.lastName) })
    println(people.map { it.value.firstName }.zip(people.map { it.value.lastName }))

    /////////////////////////////// also
    people.also { it.values.forEach { println("${it.firstName} is ${it.age} years old.") }}

    /////////////////////////////// union distinct
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 101)
    println(list1.union(list2).distinct())

    /////////////////////////////// contains
    println(list1.filter { it in list2 })
    println(list1.filter { list2.contains(it) })


    /////////////////////////////// covariant -out, can take and cannot add

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    //paper = regularPaper

    /////////////////////////////// contravariant -in, cannot take and can add

    regularPaper = paper
}

data class Person(val firstName: String,
    val lastName: String,
    val age: Int) {
}

class Person2(val firstName: String,
                  val lastName: String,
                  val age: Int) {

    operator fun component1 () = firstName
    operator fun component2 () = lastName
    operator fun component3 () = age
}

class Box<in T> {


}

open class Paper {

}
class Regular: Paper() {

}

class Premium: Paper() {

}
