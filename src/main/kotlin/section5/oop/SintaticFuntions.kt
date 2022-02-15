package section5.oop

fun main(args: Array<String>) {
    println(Util().upperFirstAndLast("jorge"))
    println("jorge".upperFirstAndLast())
    println("jorge".upperFirstAndLast2())
}

class Util {

    // kind of java
    fun upperFirstAndLast(str: String): String {
        var upperFirst = str.substring(0, 1).uppercase() + str.substring(1)
        return upperFirst.substring(0, upperFirst.length- 1 ) +
                upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
    }
}

//extension function using this
fun String.upperFirstAndLast(): String {
    var upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length- 1 ) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

//extension function without this
fun String.upperFirstAndLast2(): String {
    var upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length- 1 ) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

//extension function without this
inline fun String.upperFirstAndLast3(): String {
    var upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length- 1 ) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}
