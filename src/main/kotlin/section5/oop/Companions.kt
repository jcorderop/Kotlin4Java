package section5.oop

fun main(args: Array<String>) {
    println(MyComponion.accessStatic())
    println(MyComponion.accessStatic())

    ///////////////////////////////////////////////

    println(SomeMoreCompanion3.giveMeInstance("Hallo Instance").someForComapanion)
    println(SomeMoreCompanion3.lowerCase("Hallo Instance", lowercase = false).someForComapanion)
}

class MyComponion {
    companion object IamCompanion {
        private var pvar = "like a static..."

        fun accessStatic() = pvar
    }
}


class SomeMoreCompanion  {

    val someForComapanion: String

    constructor(someForComapanion: String) {
        this.someForComapanion = someForComapanion
    }

    constructor(someForComapanion: String, lowercase:Boolean) {
        if (lowercase) {
            this.someForComapanion = someForComapanion.uppercase()
        } else {
            this.someForComapanion = someForComapanion.uppercase()
        }
    }

}

class SomeMoreCompanion2 (val someForComapanion: String) {
    companion object IamCompanion {
        fun giveMeInstance(someForComapanion: String) = SomeMoreCompanion(someForComapanion)
        fun lowerCase(someForComapanion: String, lowercase:Boolean): SomeMoreCompanion {
            if (lowercase) {
                return SomeMoreCompanion(someForComapanion.lowercase())
            } else {
                return SomeMoreCompanion(someForComapanion.uppercase())
            }
        }
    }
}

//using factory patter
class SomeMoreCompanion3 private constructor (val someForComapanion: String) {
    companion object IamCompanion {
        fun giveMeInstance(someForComapanion: String) = SomeMoreCompanion(someForComapanion)
        fun lowerCase(someForComapanion: String, lowercase:Boolean): SomeMoreCompanion {
            if (lowercase) {
                return SomeMoreCompanion(someForComapanion.lowercase())
            } else {
                return SomeMoreCompanion(someForComapanion.uppercase())
            }
        }
    }
}