package section4.datatypes

fun main(args: Array<String>) {
    var str:String? = "Test"
    if (str != null) {
        println(str.uppercase())
    }
    var str2:String? = null
    println(str2?.uppercase())

    ///////////////////////////////////

    var str3 = str2 ?: "thanks elvis"
    println(str3.uppercase())

    var str4 = str ?: "thanks elvis"
    println(str4.uppercase())

    ///////////////////////////////////

    var arrayToCast: Any = arrayOf<Long>(1, 2, 3, 4)
    println(arrayToCast)
    var str5 = arrayToCast as? String
    println(str5?.uppercase())

    ///////////////////////////////////

    var str6:String? = str2
    //println(str6!!.uppercase())

    ///////////////////////////////////

    str?.let { printText(it) }
    str2?.let { printText(it) }

    ///////////////////////////////////

    println(str == str2)
}

fun printText(text: String) {
    println("logger: "+text)
}