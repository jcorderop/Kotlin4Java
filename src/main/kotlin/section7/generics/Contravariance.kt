package section7.generics


fun main(args: Array<String>) {

    val flowerCare= object: FlowerCare<Flower> {
        override fun prune(flower: Flower) {
            println("Generic: I am pruning a ${flower.javaClass.simpleName}... $flower")
        }
    }

    val roseGarden2 = GardenModern<Rose>(listOf(Rose(), Rose(), Rose()), flowerCare)
    roseGarden2.tennFlower(2)

    println("---------------------------")

    val flowerCareRose = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) {
            println("I am pruning a Rose... $flower")
        }
    }
    val roseGarden = GardenModern<Rose>(listOf(Rose(), Rose(), Rose()), flowerCareRose)
    roseGarden.tennFlower(2)

    println("---------------------------")
    val flowerCareDeffodil = object: FlowerCare<Deffodil> {
        override fun prune(flower: Deffodil) {
            println("I am pruning a Deffodil... $flower")
        }
    }
    val deffodilGarden = GardenModern<Deffodil>(listOf(Deffodil(), Deffodil(), Deffodil()), flowerCareDeffodil)
    deffodilGarden.tennFlower(2)
}

class Deffodil: Flower() {

}

class GardenModern<T: Flower> (val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower (take: Int) = flowers[take]

    fun tennFlower (take: Int) {
        flowerCare.prune(flowers[take])
    }
}

interface FlowerCare<in T> {
    fun prune(flower: T)
    //fun pick(): T -> Not possible
}