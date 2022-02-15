package section9

fun main(args: Array<String>) {
    val car = Car("Toyota", "Green", 2015)

    car.variableMethod(4, "hallo", "goodbye")
    car.variableMethod(4, *arrayOf("hallo1", "goodbye1"))

    car.wantsInts(intArrayOf(1,2,3,4,5))

    println(car.anObject.javaClass)
    //(car.anObject as java.lang.Object).notify()

    ////////////////////////////////
    println("x = ${Car.constant}")
    println("x = ${Car.getConstant()}")

    car.demoThread()
    car.demoThread{println("Doing Something with the thread")}
}