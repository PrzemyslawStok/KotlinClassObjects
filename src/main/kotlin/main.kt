interface drinking{
    fun tea(){print("Tea 1")}
    fun coffee()
}

open class transport{
    open fun getTicket(){
        println("Bilet na uczelnię...")
    }
}

class Teacher(val name: String, val surname: String):drinking,transport(){
    override fun tea() {
        println("Pije podwójną herbatę")
    }

    override fun coffee() {
        println("Pije małą kawę")
    }

    override fun getTicket() {
        println("Bilet dla nauczyciela...")
        super.getTicket()
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

fun main() {
    val toDrink = mutableListOf<drinking>()


    for(i in 1..5){
        toDrink.add(Student("Przemysław${i}","Stokłosa${i}"))
        toDrink.add(Teacher("Piotr${i}","Stokłosa${i}"))
    }

    toDrink.forEach{it.tea()}

    addTransports()
}

fun addTransports(transport: List<transport>){

}
