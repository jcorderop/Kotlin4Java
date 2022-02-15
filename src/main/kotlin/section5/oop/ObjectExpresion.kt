package section5.oop

fun main(args: Array<String>) {

    var toMultiply = 500

    wantsSomethingFromInterface(object: MyObjectExpression {
        override fun pleaseImplementMe(value: Int) = value * toMultiply
    })
}

interface MyObjectExpression {
    fun pleaseImplementMe(value: Int): Int
}

fun wantsSomethingFromInterface(theInterface: MyObjectExpression) {
    println(theInterface.pleaseImplementMe(2))
}