
@file:JvmName("KotrlinStaticFun")

package section5.oop

import java.io.IOException

const val MY_CONST1 = 100

fun main(args: Array<String>) {

    println(MY_CONST1)

    val employee = Employee("Jorge")
    println(employee.firstName)

    val employeeKotlin = EmployeeKotlin("Jorge")
    println(employeeKotlin.firstName)

    val employeeKotlinSimple = EmployeeKotlinSimple("Jorge", 2018)
    println(employeeKotlinSimple.firstName)

    /////////////////////////////////////////
    val employeeKotlinConst = EmployeeKotlinConst("Jorge")
    println(employeeKotlinConst.firstName)
    println(employeeKotlinConst.fullTime)

    val employeeKotlinConst2 = EmployeeKotlinConst("Jorge", false)
    println(employeeKotlinConst2.firstName)
    println(employeeKotlinConst2.fullTime)

    /////////////////////////////////////////
    val employeeKotlinConstSimple = EmployeeKotlinConstSimple("Jorge")
    println(employeeKotlinConstSimple.firstName)
    println(employeeKotlinConstSimple.fullTime)

    val employeeKotlinConst2Simple = EmployeeKotlinConstSimple("Jorge", false)
    println(employeeKotlinConst2Simple.firstName)
    println(employeeKotlinConst2Simple.fullTime)

    /////////////////////////////////////////

    val employeeKotlin3 = EmployeeKotlin3("Jorge")
    println(employeeKotlin3.firstName)
    println(employeeKotlin3.fullTime)
    employeeKotlin3.fullTime = false

}

fun topLevel(){
    println("Hallo from kotlin")
}

fun String.printExtensionFunction(){
    println(this)
}

@JvmOverloads
fun defaultArgs(str: String, num: Int = 25) {
    println("STR = $str and num = $num")
}

//java way
class Employee constructor(firstName: String) {

    var firstName: String

    init {
        this.firstName = firstName
    }

}

//kotlin way simplified
class EmployeeKotlin constructor(firstName: String) {

    var firstName: String = firstName

}

//kotlin way simplest
data class EmployeeKotlinSimple (val firstName: String, @JvmField var startYear: Int) {

    companion object {
        const val isGood = true
        @JvmField val isEmployee = true
        @JvmStatic fun employeeComp () = println("I am in comp...")
    }

    fun printMe(test: String) {
        println("print me $test...")
    }

    @Throws(IOException::class)
    fun doIO() {
        throw IOException("Some IO Exception")
    }
}

//kotlin way Constructor
class EmployeeKotlinConst (val firstName: String) {

    var fullTime: Boolean = true

    constructor(firstName: String, fullTime:Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}

//kotlin way Constructor simplifier
class EmployeeKotlinConstSimple (val firstName: String, var fullTime: Boolean = true) {
}

// custom constructor
class DemoNoPrimaryCons {
    val dummy: String

    constructor() {
        dummy = "hello"
    }
}

//kotlin custom accessor
class EmployeeKotlin3 (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Just checking get fullTime: $field")
        return field
    }
    set(value) {
        println("Just checking set fullTime: $value")
        field = value
    }
}