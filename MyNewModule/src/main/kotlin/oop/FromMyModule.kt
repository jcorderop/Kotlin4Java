package main.kotlin.oop

import section5.oop.Departments
import section5.oop.EmployeeKotlinConst as EmployeeAlias
import section5.oop.other.packages.toLevel as topLevelFun

fun main(args: Array<String>) {
    topLevelFun()
    var employeeKotlinConstSimple = EmployeeAlias("Jorge")
    println(employeeKotlinConstSimple.firstName)

    println(Departments.HR.getDepInfo())
}