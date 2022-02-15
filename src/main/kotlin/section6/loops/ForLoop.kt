package section6.loops

fun main(args: Array<String>) {
    val numRange = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"
    println(stringRange)

    val str = "hello"
    for (i in str) {
        println(i)
    }

    println(3 in numRange)
    println('c' in charRange)
    println("CCC" in stringRange)
    println("CCCCCCC" in stringRange)
    println("ZCCCCCZ" in stringRange)

    ////////////////
    val backwardRange = 5.downTo(1)
    println(3 in numRange)

    val numRange2 = 0..100
    val numRangeStep = numRange2.step(10)
    println(numRangeStep)
    for (i in numRangeStep) {
        println(i)
    }

    ////////////////
    val numReversed = numRangeStep.reversed()
    println(numReversed)
    for (i in numReversed) {
        println(i)
    }

    ////////////////
    for (i in 0..10 step 2) {
        println(i)
    }

    ////////////////
    for (i in 15 downTo 5 step 2) {
        println(i)
    }

    ////////////////
    for (i in 0 until 10) {
        println(i)
    }

    ////////////////
    val str2 = "hello"
    val numRange3 = 0 until str2.length
    for (i in numRange3) {
        println(str2.get(i))
    }
}