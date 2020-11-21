class Teacher(val name: String, val surname: String): drinking, transport(){
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
