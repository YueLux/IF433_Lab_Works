package oop_00000130143_SHIFFAQALBIANALFARYSI.week06

interface  Clickable {
    val nama: String
    fun click()
}

class Button(override val nama: String) : Clickable {
    override fun click() {
        println("Tombol '$nama' berhasil diklik!")
    }
}