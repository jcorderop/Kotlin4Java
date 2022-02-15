package section7.lambdas

import section5.oop.EmployeeKotlin
import section5.oop.EmployeeKotlinSimple

fun main(args: Array<String>) {
    run {println("something")}

    val employeeKotlin = listOf<EmployeeKotlinSimple>(
        EmployeeKotlinSimple ("Jorge",  2012),
        EmployeeKotlinSimple("Vidal", 2018),
        EmployeeKotlinSimple("Dana", 2017),
        EmployeeKotlinSimple("Alicia", 2019)
    )

    println(employeeKotlin.minByOrNull { employeeKotlin -> employeeKotlin.startYear })
    println(employeeKotlin.minByOrNull { employeeKotlin: EmployeeKotlinSimple -> employeeKotlin.startYear })
    println(employeeKotlin.minByOrNull { it.startYear })
    println(employeeKotlin.minByOrNull (EmployeeKotlinSimple::startYear))

    ///////////////////////////////
    var num = 10
    run {
        num += 5
        println(num)
    }

    ///////////////////////////////
    useParam(employeeKotlin, num)

    ///////////////////////////////
    run { return@run ::topLevel }.invoke()

    ///////////////////////////////
    println(countTo100())
    println(countTo100With())
    println(countTo100WithThis())
    println(countTo100WithThisApply())

    ///////////////////////////////
    findByLastName(employeeKotlin, "Jorge")
    findByLastName(employeeKotlin, "Pepe")

    findByLastNameForEach(employeeKotlin, "Jorge")
    findByLastNameForEach(employeeKotlin, "Pepe")

    ///////////////////////////////
    "some".apply someString@ {
        "something else".apply {
            println(lowercase())
            println(this@someString.uppercase())
        }
    }
    println("---------------------------")
}

fun findByLastName(emps: List<EmployeeKotlinSimple>, firstName: String) {
    for (emp in emps) {
        if (emp.firstName == firstName) {
            println("Found $firstName")
            return
        }
    }
    println("Not Found $firstName")
}

fun findByLastNameForEach(emps: List<EmployeeKotlinSimple>, firstName: String) {
    emps.forEach retunBlock@{
        if (it.firstName == firstName) {
            println("Found $firstName")
            return@retunBlock
        }
    }
    println("Not Found $firstName")
}

fun countTo100(): String {
    val num = StringBuffer()
    for (i in 1..99) {
        num.append(i)
        num.append(", ")
    }
    num.append(100)
    return num.toString()
}

fun countTo100With(): String {
    val num = StringBuffer()
    return with(num) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        return toString()
    }
}

fun countTo100WithThis(): String = with(StringBuffer()) {
        for (i in 1..99) {
            this.append(i).append(", ")
        }
        this.append(100).toString()
    }

fun countTo100WithThisApply(): String = StringBuffer().apply() {
        for (i in 1..99) {
            this.append(i).append(", ")
        }
        this.append(100)
    }.toString()

fun topLevel() = println("Just Something...")


fun useParam(employeeKotlinSimple: List<EmployeeKotlinSimple>, num: Int) {
    employeeKotlinSimple.forEach {
        println(it.firstName)
    }
}