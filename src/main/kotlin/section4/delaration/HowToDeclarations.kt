package section4.delaration

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    var number1 = 25
    var number2: Int
    number2 = 10
    number2 = 8
    var number3: Int = 25 //not common
    var number4: Short = 25 //to force the type

    //
    val employee1 = Employee("Jorge Cordero", 500)
    employee1.name = "Lynn Smith"
    println(employee1.toString())

    val employee2: Employee

    if (number2 > number1) {
        employee2 = Employee("Vidal", 100)
    } else {
        employee2 = Employee("Alicia", 101)
    }

    println(employee2.toString())

    var employees: EmployeeSet

    //collections
    val name = arrayListOf("Jorge", "Vidal", "Alicia")
    println(name[1])

    //equals
    println(employee1.equals(employee2))
    println(Employee("Alicia", 101).equals(Employee("Alicia", 101)))

    //casting
    if (employee2 is Employee) {
        println(employee2.name)
    }

    //string template
    val change = 4.22
    println("so show the value of $change")
    println("so show the value of $ $change")

    val numerator = 10.99
    val denominator = 20.99
    println("value of $numerator divided by $denominator is ${numerator/denominator}")

    println("Employee id is ${employee1.id}")

    //raw strings
    val somethingSomething = """something
       |else is happening
       |and I do not know
    """.trimMargin("|")
    println(somethingSomething)

    val filePath = """c:\temp\test"""
    println(filePath)

    //REPL
}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}