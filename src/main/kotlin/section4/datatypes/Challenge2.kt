package section4.datatypes

fun main(args: Array<String>) {
    // float
    var myFloat1: Float = -1236.56f //No needed
    var myFloat3 = -1236.56.toFloat() //No needed
    var myFloat2 = -1236.56f

    // float nullable
    var myFloat4: Float? = -1236.56f

    // array
    var myShort = arrayListOf<Short>(5)
    var myShort2 = Array<Short>(16) {i -> (i * 2).toShort()}

    // array nullable

    var myShort3 = arrayOfNulls<Int>(5)
    var myShort4 = Array<Int?>(50) {i -> (i+1)*5}

    // if else default nullable
    var x: String? = null
    var ifElse = x?.toString() ?: "default"

    // if else default nullable
    x?.let { println(it.length) }
}