package oop_00000130600_RioRivaldi

class nonGeneric(var hasil: Any);

class Generic<T>(var hasil: T);

class Kota<T, V>(var kodepos: T, var telp: V);

fun<T> cobaFungsi(angka: T): T {
    return angka;
}

//generic programing - type constraint
fun <T : Number> tambah(angka: T): Double {
    return angka.toDouble() + 50;
}
fun <T : Number> kurang(angka: T): Int{
    return angka.toInt() - 50
}
//generic Programing - functiopn in class
class kalkulator<T: Number>(val a:T, var b:T) {
    fun kali():Double{
        return a.toDouble() * b.toDouble()
    }
    fun bagi(): Int {
        return b.toInt() / b.toInt()
    }
}

//generic Programing - list
fun <T> nilaiKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T> {
    return list.filter { it > kkm }
}


fun main(){
    println("=== Generic where ====")
    val nilaiMhs = listOf(80,90,83,70,65,50,83,50,61)
    val nilaiFilterKKM = nilaiKKM(list = nilaiMhs, kkm = 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)

    println("=== Generic Function in class===")
    val kalk = kalkulator(a = 10.2, b = 3.5)
    println("Hasil kali ${kalk.kali()}")
    println("Hasil bagi ${kalk.bagi()}")
    println("=== Generic - constraint ")
    println("Hasil tambah: " + tambah(angka = 100.5))
    println("Hasil Kurang: " + kurang(angka = 100.5))
    println("=== NonGeneric ===")
    val nGen = nonGeneric(hasil = 100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)
    println("=== Generic ===")
    val gen = Generic(200)
    println(gen.hasil + 50)

    println("=== Generic 2 Parameters ===")
    val city = Kota(kodepos = "12345", telp = "880123")
    println("kodepos kamu " + city.kodepos)
    println("telp kamu " + city.telp)

    println("=== GENERIC FUNCTION ===")
    println("Coba Fungsi: " + cobaFungsi(angka = 10));
}