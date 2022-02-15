package section7.generics

fun main(args: Array<String>) {

    println("--------------------------------------")
    val ints = listOf(1,2,5,36)
    convertToInt(ints)

    println("--------------------------------------")
    val doubles = listOf(1.5,2.9,5.45,36.1)
    convertToInt(doubles)

    println("--------------------------------------")
    val short = listOf(1,2,5,36)
    convertToInt(short)

    println("--------------------------------------")
    val short2 = listOf<Short?>(1,2,null,5,36)
    convertToIntNullableTyped(short2)

    println("--------------------------------------")
    val string = listOf<String?>("1","2",null,"5","36")
    convertToIntNullable(string)

    println("--------------------------------------")
    val string2 = listOf<String>("1","2","5","36")
    convertToIntNOTNullable(string2)

    println("--------------------------------------")
    append(StringBuilder("S1"), StringBuilder("S2"))

    println("--------------------------------------")
    if (string2 is List<String>) {
        println("yes it is...")
    }

    println("--------------------------------------")
    val listAny: Any = listOf("1","2","5","36")
    if (listAny is List<*>) {
        println("yes it is start projection...")
    }

    println("--------------------------------------")
    val listAny2: Any = listOf("1",2.0,"5","36")
    if (listAny is List<*>) {
        println("yes it is start projection CAST...")
        val strList = listAny2 as List<Int>
        println(strList)
    }
}

fun <T> append (item1: T, item2: T) where T: CharSequence, T: Appendable {
        println("Result: ${item1.append(item2)}")
}

fun <T:Number> convertToInt(list: List<T>) {
    list.forEach { println("Result: ${it.toInt()}")}
}

fun <T:Number?> convertToIntNullableTyped(list: List<T>) {
    list.forEach { println("Result: ${it?.toInt()}")}
}

fun <T> convertToIntNullable(list: List<T>) {
    list.forEach { println("Result: ${it.toString()}")}
}

fun <T:Any> convertToIntNOTNullable(list: List<T>) {
    list.forEach { println("Result: ${it.toString()}")}
}