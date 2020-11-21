interface drinking{
    fun tea(){print("Tea 1")}
    fun coffee()
}

class Tacher(val name: String, val surname: String):drinking{
    override fun tea() {
        println("Pije podwójną herbatę")
    }

    override fun coffee() {
        println("Pije małą kawę")
    }

}

class Student(val name: String, val surname: String):drinking{
    override fun tea() {
        println("Zamawia małą harbatę")
    }

    override fun coffee() {
        println("Pije dużą kawę")
    }

}

fun main(args: Array<String>) {

}
