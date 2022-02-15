package section5.oop

fun main(args: Array<String>) {
    println(mult(2,6,"result:"))
    println(mult2(2,6,"result:"))
    println(mult3(2,6,))

    /////////////////////////////////////////////
    val student = Student("Jorge")
    println(student.upperCaseStudent())

    /////////////////////////////////////////////
    val car = Car(color = "RED", model = "FORD", year = 2018)
    val car2 = Car(color = "GREEN", model = "TOYOTA", year = 2019)
    printCarColors(car, car2, label = "Colors:")
    printCarColors(car, car2)

    /////////////////////////////////////////////
    val arrayOfCars = arrayOf(car, car2)
    printCarColors(*arrayOfCars)

    /////////////////////////////////////////////
    val moreCars = arrayOf(car, car2)

    val lotsOfCars = arrayOf(*arrayOfCars, *moreCars, car2)
    printCarColors(*lotsOfCars)
}

fun mult(x: Int, y: Int, label: String): String {
    return ("$label ${x * y}")
}

// Simple
fun mult2(x: Int, y: Int, label: String): String = "$label ${x * y}"

// Simple more
fun mult3(x: Int, y: Int, label: String = "default:") = "$label ${x * y}"

fun printCarColors(vararg cars: Car, label: String = "Default:") {
    println("Printing Car colors...")
    println("Number of cars: ${cars.size}")
    for (car in cars) {
        println("$label ${car.model} is ${car.color}")
    }
}

class Student(val firstName: String) {
    fun upperCaseStudent() = firstName.uppercase()
}


