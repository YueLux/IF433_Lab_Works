package oop_00000130600_RioRivaldi_Week06

interface  Clickable {
    val nama: String
    fun click()
}

class Button(override val nama: String) : Clickable {
    override fun click() {
        println("Tombol '$nama' berhasil diklik!")
    }
}