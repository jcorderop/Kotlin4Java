package section7.generics

fun main(args: Array<String>) {
    val list: MutableList<String> = mutableListOf("Hallo", "Jorge")
    printCollection(list)
    printCollectionGeneric(list)

    list[0].uppercase()
    ////////////////////////////////////////////////////////////
    val list2: MutableList<Int> = mutableListOf(1,3,5,6,2)
    printCollectionGeneric(list2)

    ////////////////////////////////////////////////////////////
    list.printCollectionGenericExtensionFun()
}

fun printCollection(list: List<String>) {
    list.forEach { v -> println("$v") }
}

fun <T> printCollectionGeneric(list: List<T>) {
    list.forEach { v -> println("$v") }
}

fun <T> List<T>.printCollectionGenericExtensionFun() {
    this.forEach { v -> println("$v") }
}
