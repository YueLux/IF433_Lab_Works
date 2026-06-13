package oop_00000130600_RioRivaldi_Week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")


    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' bisa dihilangkan (implicit)
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")

    val newUser = User("Budi", 20).apply {
        age = 21 // Mengubah umur
    }.also {
        println("User baru berhasil dibuat: $it")
    }

}