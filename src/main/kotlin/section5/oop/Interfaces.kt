package section5.oop

fun main(args: Array<String>) {
    val extendsMyChildInterface = ExtendsMyChildInterface()
    extendsMyChildInterface.myFunction("Jorge")
    extendsMyChildInterface.myChildFunction()

    //////////////////////////////////////////////////////
    val extendsMyChildInterfaceFromAnyClass = ExtendsMyChildInterfaceFromAnyClass("Pepe")
    extendsMyChildInterfaceFromAnyClass.myFunction("error")
    extendsMyChildInterfaceFromAnyClass.myChildFunction()
    extendsMyChildInterfaceFromAnyClass.myFunctionToUse()

}

interface MyInterface {
    val someVar: Int
    val someVarConcrete: Int
        get() = 45
    fun myFunction(str: String) = println("Halo $str")
}

interface MyChildInterface: MyInterface {
    fun myChildFunction()
}

class ExtendsMyChildInterface: MyChildInterface {

    override var someVar: Int = 20
    override fun myChildFunction() = println("Doing something with my child")
}

open class AnyClass(val howAmI: String) {
    open fun somethingAny() {
        println("AnyClass")
    }
}

class ExtendsMyChildInterfaceFromAnyClass(howAmI: String): AnyClass(howAmI)
    , MyChildInterface {
    override fun myChildFunction() {
        println("This in me: $howAmI")
    }

    override val someVar: Int = 85

    override fun somethingAny() {
        println("ExtendsMyChildInterfaceFromAnyClass")
    }

    fun myFunctionToUse() {
        myFunction(howAmI)
    }

}