package LecWEEK12

import java.io.DataInput

fun pembagian() {
    try {
        val a = 10
        val b = 12
        val hasil = a / a
        println("Hasil Bagi$hasil")
    }catch (e:Exception){
        println("Ada error" + e.message)
    }finally {
        println("Selesai dieksekusi")
    }
}

fun cek_tipe_variabel(){
    var angka:Int = try {
        Integer.parseInt("123")
    }catch (e: Exception) {
        println("ada erro ${e.message}")
        777
    }
    println(angka)
}

fun cek_nilai(nilai:Int){
    if (nilai < 0){
        throw  IllegalArgumentException("nilai is negative")
    }else if (nilai > 100) {
        throw  IllegalArgumentException("nilai is too big")
    }else {
        println("nilai kamu adalah" + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran: Int, var saldo:Int):
    Exception("Saldo kamu sisa $saldo, gak cukup buat belanja $pengeluaran"){

}

class transaksi_keuangan(val totalBelanjang:Int){
    fun narik_uang(balance: Int){
        if (totalBelanjang > balance){
            throw cek_saldo_rekening(totalBelanjang,balance)
        }else {
            println("Transaksi Berhasil, sisa saldo ${balance - totalBelanjang}")
        }
    }

}

fun multiple_catch(input:String){
    try {
        val angka:Int = input.toInt()
        val hitungBagi: Int = angka/0
        println("Hasil Bagi$hitungBagi")
    }catch (e:NumberFormatException){
        println("ga bisa membagi bilangan huruf ${e.message}")
    } catch (e: ArithmeticException) {
        println("Masa pembagian pake 0: ${e.message}")
    }catch (e:Exception){
        println("Ada erro do multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan:String):Exception("Error di BANK Exception $pesan")
class cek_saldo(val pengeluaran:Int): BANKException("Belnja $pengeluaran lebih besar dari saldo")
class cek_input(val transaksi:Int): BANKException("Transaksi masa minus$transaksi")

fun transaksi_belanjang(saldoKamu: Int, jajankamu: Int): Int{
    if (jajankamu < 0){
        throw cek_input(jajankamu)
    }else if(saldoKamu < jajankamu) {
        throw cek_saldo(jajankamu)
    }
    return  saldoKamu - jajankamu
}


fun main(){
    runCatching {transaksi_belanjang(saldoKamu = 1000, jajankamu = 1000)}
        .onSuccess { println("Belanja Berhasil, sisa saldo $it") }
        .onFailure { println(it) }
    multiple_catch(input = "123")
    pembagian()
    cek_tipe_variabel()
    try {
        cek_nilai(-10)
    }catch (e:Exception){
        println("Ada erro " + e.message)
    }
    val trx = transaksi_keuangan(1500)
    trx.narik_uang(1200)
}