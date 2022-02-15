package section5.oop

fun main(args: Array<String>) {
    println(Departments.HR.getDepInfo())
}

enum class Departments(val fullName: String, val id: Long) {
    HR("HR",1),
    IT("IT",2),
    ACCOUNTING("ACCOUNTING",3),
    SALES("SALES",4);

    fun getDepInfo() = "Name $fullName with ID $id"
}