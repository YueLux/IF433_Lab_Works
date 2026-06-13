package oop_00000130600_RioRivaldi_Week13

class  Alamat(val kota:String?)
class  Mahasiswa(val address: Alamat)

fun main(){
    val mhs1 = Mahasiswa(address = Alamat("Tangerang"))
    val mhs2 = Mahasiswa(address = Alamat( null))

    println("Mahasiswa: ${mhs1.address.kota}")
    println("Mahasiswa: ${mhs2.address.kota}")

    val tetapAlamat = Alamat(kota = null)
    val defaultAlamat = tetapAlamat.kota?.let {
            adrs->"Alamat kamu adalaaaah $adrs"
    } ?:"Alamat kamu kosong"
    println("Alamat kamu : ${defaultAlamat}")
}