package oop_00000130600_RioRivaldi_Week13

class profile_page(val idprofile: String?, val statusonline: String?) {
    fun ganti_foto(filePhoto: String?) {
        println("Foto kamu ${filePhoto}")
    }
}
fun main () {
    var nama: String? = "Bian"
    nama = null
    println("Nama kamu $nama")

    val profile = profile_page("12345", "Online")
    println("idprofile = ${profile.idprofile} statusonline = ${profile.statusonline}")

    profile.ganti_foto("Fotosayasamakamu.jpg")
}