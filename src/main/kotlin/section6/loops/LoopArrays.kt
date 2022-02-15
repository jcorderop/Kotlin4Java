package section6.loops

fun main(args: Array<String>) {
    val seasons = arrayOf("A","B","C","D")
    for (season in seasons) {
        println(season)
    }
    println()
    seasons.forEach { println(it) }
    seasons.forEachIndexed() { index, season -> println("Id: $index with name: $season") }

    println()
    for (season in seasons.indices) {
        println("Id: $season with name: ${seasons[season]}")
    }
    println()
    println("w" !in seasons)

    println()
    val str = "hello"
    println("w" !in str)

    println()
    val numRange = 1..20
    println(22 in numRange)

    ////////////////////////////////////

    iLoop@ for (i in 1..5) {
        println("i $i")
        jLoop@ for (j in 10..12) {
            println("j $j")
            xLoop@ for (x in 20..24) {
                println("x $x")
                if (x == 22) {
                    break@jLoop
                }
            }
        }
    }
}