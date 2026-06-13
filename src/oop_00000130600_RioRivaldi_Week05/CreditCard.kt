package oop_00000130143_SHIFFAQALBIANALFARYSI.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit Rp$amount berhasil. Total terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("[$accountName] Transaksi ditolak! Melebihi limit. Sisa limit: Rp${limit - usedAmount}")
        }
    }
}