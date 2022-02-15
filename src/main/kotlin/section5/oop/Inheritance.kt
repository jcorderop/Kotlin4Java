package section5.oop

fun main(args: Array<String>) {
    val laserPrinter4 = LaserPrinter4("HP", 22)
    laserPrinter4.printModel()
    println(laserPrinter4.bestSellingPrice())

    /////////////////////////////////////////

    val somethingElse2 = SomethingElse2("Epson", 24)
    println(somethingElse2.someProperty)
    println(somethingElse2.someInt)
}

//Basic primary constructor
open class Printer() {
}

class LaserPrinter(): Printer() {
}


//Basic primary constructor using constructor
open class Printer2 {
}

class LaserPrinter2: Printer2 {
    constructor(): super()
}

//Basic primary constructor with parameters
open class Printer3(val modelName: String) {
}

class LaserPrinter3(modelName: String): Printer3(modelName) {
}

//Basic abstract
abstract class Printer4(val modelName: String) {
    open fun printModel() = println("ModelName: $modelName")

    abstract fun bestSellingPrice(): Double
}
// override abstract function
open class LaserPrinter4(modelName: String, ppm: Int): Printer4(modelName) {

    final override fun printModel() = println("Laser ModelName: $modelName")

    final override fun bestSellingPrice(): Double = 124.36

}

class SpecialLaserPrinter4(modelName: String, ppm: Int): LaserPrinter4(modelName, ppm) {


}
/////////////////////////////////////////////////////////////////
//without primary constructor
open class Something {
    val someProperty: String
    constructor(someProperty: String) {
        this.someProperty = someProperty
    }
}
class SomethingElse: Something {

    constructor(someProperty: String): super(someProperty)
}

//with primary constructor
open class Something2(val someInt: Int) {
    var someProperty: String = "something"
    constructor(someProperty: String, someInt: Int): this(someInt) {
        this.someProperty = someProperty
        println("parent constructor")
    }
}

class SomethingElse2: Something2 {

    constructor(someProperty: String, someInt: Int): super(someProperty, someInt) {
        println("child constructor")
    }
}

/////////////////////////////////////////////