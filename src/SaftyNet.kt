package oop_00000130600_RioRivaldi

fun main() {
    val nama: String = "Bian"
    try {
        println("hai : $nama")
        println("panjang huruf ${nama!!.length}")
    } catch (e: Exception){
        println("ada error exception: ini pesen erronya ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for (item in mixedData) {
        val hasil = item as? String
        if (hasil == null) {
            println(hasil)
        }
    }
}