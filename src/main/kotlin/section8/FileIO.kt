package section8

import java.io.File

fun main(args: Array<String>) {
    println("-----------------------------------------")
    ///////////////////////////////////////////////////// best line by line
    val fileReader = File("test.txt").reader()
    fileReader.forEachLine { println(it) }

    println("-----------------------------------------")
    ///////////////////////////////////////////////////// best line by line
    val fileReader11 = File("test.txt").reader()
    fileReader11.useLines { it.forEach { println(it) } }

    println("-----------------------------------------")
    /////////////////////////////////////////////////////
    val fileReader2 = File("test.txt").reader()
    println(fileReader2.readText())
    fileReader2.close()

    /////////////////////////////////////////////////////
    println("-----------------------------------------")
    val fileReader3 = File("test.txt").reader()
    println(fileReader3.use { it.readText() })

    /////////////////////////////////////////////////////
    println("-----------------------------------------")
    val fileReader4 = File("test.txt").bufferedReader()
    println(fileReader4.use { it.readText() })

    ///////////////////////////////////////////////////// NO
    println("-----------------------------------------")
    val fileReader5 = File("test.txt").readText()
    println(fileReader5)
}