package LecWEEK11

//basic exetension
fun String.DasarExtension():String {
    return "Dasar $this"
}
fun String.RubahHurufBesarDepan():String {
    var hasil = ""
    return this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c -> c.uppercase() }
    }

    return hasil
}

fun String.tentukanKelulusan(nilai:Int):String {
    var hasil = ""
    if (nilai>70) {
        hasil = "Lulus"
    }else {
        hasil = "Remedial"
    }
    return this + "" + hasil
}

fun String?.CekNullDanEmpty():String {
    var hasil = ""
    if (this == null || this.isEmpty()) {
        hasil = "Ga boleh null atau kosong"
    }else {
        hasil = "Password kamu: $this"
    }
    return hasil
}

//untuk scope apply
data class Manusia(var nama: String, var umur: Int) {

}

fun main () {
    //extension function cek null and empty
    var passwordkamu:String? = "12345"
    println(passwordkamu.CekNullDanEmpty())
    //
    println("Budi Indah".RubahHurufBesarDepan())
    //penerapan  basic exentension
    println("Bian".DasarExtension())

    val nama1 = "Budi Indah"
    println(nama1.uppercase())

    println("Grade kamu".tentukanKelulusan(nilai = 71))

    //scope - let
    val huruf: String = "UMN"
    val hasilkampus = huruf.let {
        if (it=="umn"){
            println("Kampus saya")
        } else {
            println("Bukan kampus saya")
        }
    }
    println(hasilkampus)
    //scope - run
    var nilaiKamu = 70.run {
        if (this >= 70){
            println("Lulus")
        }else {
            println("Gagal")
        }
    }

    //scope - with
    var pekerjaan = with(receiver = "Mahasiswa") {
        if (this=="Mahasiswa") {
            println("Pelajar")
        }else{
            println("Pekerja")
        }
    }

    //scope - apply
    val orang = Manusia(nama = "Budi", umur = 25).apply {
        nama = "Budi"
        umur = 25
    }

    println("nama kamu ${orang.nama} umur kamu ${orang.umur}")

    //scope - also
    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(5)
    println(deretAngka)
}