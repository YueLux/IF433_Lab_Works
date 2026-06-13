package oop_00000130600_RioRivaldi_week05

/*fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=>Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin ->  {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")
    }
}*/

/*fun main() {

    println("=== MATH HELPER - METHOD OVERLOADING ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi = 5)           : $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 6)
    println("Luas Persegi Panjang (p=4, l=6)   : $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0)          : $luasLingkaran")
}*/

fun main() {
    println("=== SISTEM PEMBAYARAN E-COMMERCE ===")

    val ewallet = EWallet(accountName = "Budi", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Sari", limit = 100000.0)


    val daftarPembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("\n--- Tahap 1: Proses Pembayaran Rp75.000 ---")
    for (payment in daftarPembayaran) {
        println("\n[${payment.accountName}] mencoba membayar Rp75.000")
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println("=> Terdeteksi EWallet. Melakukan top up Rp50.000 otomatis...")
            payment.topUp(50000.0)
            println("=> Mencoba pembayaran ulang Rp75.000...")
            payment.processPayment(75000.0)
        }

        println("-----------Terimakasih--------------")
    }
}