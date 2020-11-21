interface drinking{
    fun tea(){print("Tea 1")}
    fun coffee()
}

open class transport{
    open fun getTicket(){
        println("Bilet na uczelnię...")
    }
}

fun main() {
    val toDrink = mutableListOf<drinking>()
    val transportWsiz = mutableListOf<transport>()

    addTransports(transportWsiz)


    for(i in 1..5){
        toDrink.add(Student("Przemysław${i}","Stokłosa${i}"))
        toDrink.add(Teacher("Piotr${i}","Stokłosa${i}"))
    }

    toDrink.forEach{it.tea()}
}

fun addTransports(transport: MutableList<transport>){
    for(i in 1..5){
        transport.add(Teacher("Przemysław","Stokłosa_${i}"))
        transport.add(transport())
    }
}
