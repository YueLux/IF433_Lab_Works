package oop_00000130600_RioRivaldi_Week13

fun main () {
    var arMhs = listOf("Budi", "Susi", "Titus");
    println("=== LIST OF ===")
    //view
    println(arMhs)
    println("Panjang list ${arMhs.size}") // lihar panjang array
    println(arMhs[1])// ambil satuan data di listof
    for (a in arMhs) {
        println("Mahasiswa bernama :  $a")
    }
    println("=== Mutable list ===")
    var arAngka = mutableListOf(10, 30, 40, 20, 90, 90, 100, 15)
    println(arAngka)

    arAngka.add(777)// nambah array
    arAngka[2] = 123 // ganti array
    arAngka.removeAt(3)
    println(arAngka)

    println("=== SET OF ===")
    var arUrutan = setOf(10, 30, 40, 20, 90, 90, 100, 15)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga?" + arUrutan.contains(40))

    println("=== Mutable set of ====")
    var arMakan = mutableSetOf("Ayam", "Bakso", "Mie", "Bakpou", "Cireng")
    arMakan.add("Ayam Kecap")
    arMakan.add("Bakso")
    arMakan.remove("Ayam Kecap")
    println(arMakan)

    println("=== Map OF ===")
    var arSiswa = mapOf(
        "Andi" to 90,
        "Toni" to 100,
        "Ivander" to 90
    )
    println("Banyak data siswa : " + arSiswa.size)
    println("Nilai si Andi " + arSiswa["Andi"])
    println("Semua keys: " + arSiswa.keys)
    println("Semua values" + arSiswa.values)
    println("Semua Keys: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("=== Map OF Mutable ===")
    var arMenu = mutableMapOf(
        "Ayam Kecap" to 10000,
        "Bakso" to 2000,
        "Mie" to 3000,
    )

    println("Banyak menu : " + arMenu.size)
    arMenu["Ayam Kecap"] = 12000
    arMenu.remove("Mie")
    arMenu.put("Udang", 23000)
    println(arMenu)

    //lambda
    println("=== Lambda ===")
    fun tembah(a: Int, b: Int): Int {
        return a+b
    }

    // Function lambda
    var kurang = {a: Int, b: Int -> a-b}

    println("Kurang-Kurangan : ${kurang(2,1)}")

    println("=== Implict it ===")
    var pangkat = {x: Int -> x+x}
    var hitungpangkat: (Int) -> Int = {it * it}
    println("Pangkat-Pangkat : ${pangkat(5)}")

    //tampilam semua hasil pakai looping
    arSiswa.forEach {
            siswa -> println(siswa)
    }
    for (sis in arSiswa) {
        println(sis)
    }
}