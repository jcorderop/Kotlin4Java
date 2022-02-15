package section5.oop

import java.time.Year

fun main(args: Array<String>) {
    println(MySingleton.currentYear)
    println(MySingleton.getTag())
    println(MySingleton.getCopyRight())
}

object MySingleton {
    val currentYear = Year.now().value
    @JvmStatic fun getTag() = "TAG"
    fun getCopyRight() = "My Copy Right"
}