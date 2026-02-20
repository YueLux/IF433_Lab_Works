package oop_00000130600_RioRivaldi_week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun printLoanInfo() {
        println("===== DATA PEMINJAMAN =====")
        println("Judul Buku : $bookTitle")
        println("Peminjam   : $borrower")
        println("Durasi     : $loanDuration hari")
        println("Total Denda: Rp ${calculateFine()}")
    }
}