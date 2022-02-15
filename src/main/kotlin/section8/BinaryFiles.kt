package section8

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream
import java.lang.Exception

fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("test.bin"))
    var si: String

    try {
        while (true) {
            //si =
            println(di.readAllBytes())
        }
    } catch (e: EOFException) {
        println(e.printStackTrace())
    }
}