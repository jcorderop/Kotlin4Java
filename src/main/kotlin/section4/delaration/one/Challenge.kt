package section4.delaration.one

fun main(args: Array<String>) {
    println("Changes one done!")

    val hello1 = "hello"
    val hello2 = "hello"

    println("check if has same reference: ${hello1 === hello2}")

    println("check if has same structure: ${hello1 == hello2}")

    var num = 2898

    val something: Any = "some text"
    if (something is String)
        println(something.uppercase())

    var text = """
        111some test
      111something else
        1111and more
    """.trimMargin("1")
    println(text)
}