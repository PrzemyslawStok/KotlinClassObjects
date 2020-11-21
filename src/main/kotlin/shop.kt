interface toSale{
    fun price()
    fun sale()

    fun printinfo()
}

interface use{
    fun use()
}

class Car:toSale,use{
    override fun price() {
        TODO("Not yet implemented")
    }

    override fun sale() {
        TODO("Not yet implemented")
    }

    override fun printinfo() {
        TODO("Not yet implemented")
    }

    fun drive(){
        println("Prowadzimy samochód")
    }

    override fun use() {
        println("Używamy samochodu")
        drive()
    }

}

class Cup:toSale,use{
    override fun price() {
        TODO("Not yet implemented")
    }

    override fun sale() {
        TODO("Not yet implemented")
    }

    override fun printinfo() {
        TODO("Not yet implemented")
    }

    fun drink(){
        println("Wypijamy zawartość")
    }

    override fun use() {
        println("Używamy kubka")
        drink()
    }

}
