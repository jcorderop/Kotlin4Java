package section5.oop

fun main(args: Array<String>) {
    val car = Car("Red", "FORD", 2005)
    println(car.toString())

    val car2 = Car(color = "Red", "FORD", 2005)
    println(car == car2)
    println(car.equals(car2)) // no needed

    ///////////////////
    val car3 = car.copy()
    println(car3)

    val car4 = car.copy(year = 2018)
    println(car4)
}

data class Car (val color:String, val model: String, val year: Int) {
}