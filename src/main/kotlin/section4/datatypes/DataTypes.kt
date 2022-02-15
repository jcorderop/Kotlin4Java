package section4.datatypes

fun main(args: Array<String>) {
    var myInt = 10

    println(myInt is Int)

    var myLong = 10L
    myLong = myInt.toLong()

    var myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    //////////////////////////////////

    var myDouble = 15.2
    println(myDouble is Double)

    var myFloat = 15.2f
    println(myFloat is Float)

    myDouble = myFloat.toDouble()

    ///////////////////////////////////

    val char = 'b'

    val myChar = 65
    println(myChar.toChar())

    ////////////////////////////////////

    var myBoolean =  true
    println(myBoolean)

    val vacationTime = false
    val onVacation = DataTypeDummy().isVacation(vacationTime)
    println(onVacation)

    ////////////////////////////////////

    var someAny: Any
}