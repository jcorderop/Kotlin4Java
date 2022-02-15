package section7.generics

fun main(args: Array<String>) {
    val mixValues: List<Any> = listOf("4", 2.5, true, 4, 7.5)
    val onlyDouble = getElements<Double>(mixValues)
    println(onlyDouble)

    val onlyString = getElements<String>(mixValues)
    println(onlyString)

}

inline fun <reified T> getElements(list: List<Any>) : List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}