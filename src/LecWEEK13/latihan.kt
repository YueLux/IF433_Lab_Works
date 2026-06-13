package LecWEEK13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class siswa(val nama:String, val umur: Int, val ipk: Double)
fun siswa.toCSV():String = "$nama, $umur, $ipk"


fun main(){
    val murid = siswa(nama = "Budi", umur = 20, ipk = 3.8)
    println(murid.toCSV())


    //simpan banyak value
    val datasiswa = listOf(
        siswa(nama = "udin", umur = 21, ipk = 3.1),
        siswa(nama = "adin", umur = 22, ipk = 3.2),
        siswa(nama = "odin", umur = 23, ipk = 3.3),
    )

    val data = datasiswa.joinToString(separator = "\n")
    println(datasiswa)

    val fileBuat2 = File("src/LecWEEK13/filecontoh.csv")
    fileBuat2.writeText(data)





    //cara pertama
    println("=== cara pertama ===")
    val fileSaya = File("src/LecWEEK13/filecontoh.txt")
    val bacaFile = fileSaya.readText()
    println(bacaFile)

    //cara kedua
    println("=== cara kedua ===")
    val fileKamu = File("src/LecWEEK13/filecontoh.txt")
    val bacaKamu = fileKamu.readLines()
    bacaKamu.forEach {
        println("ke 2:: " + it)
    }

    //cara3(bufferreader)
    println("=== cara 3 (bufferreader)")
    val br = BufferedReader(FileReader("src/LecWEEK13/filecontoh.txt"))
    var baris: String? = br.readLine()
    while (baris != null) {
        println(baris)
        baris = br.readLine()
    }
    br.close()

    //cara 4
    println("=== cara 4(bufferreaderuse)")
    val br2 = BufferedReader(FileReader("src/LecWEEK13/filecontoh.txt"))
    br2.use {
            baris -> baris.lineSequence()
        .filter { it.isNotEmpty() }
        .forEach { println(it) }
    }

    //cara buat file
    println("=== cara 5 (buarfile) ===")
    val filebuat = File("src/LecWEEK13/filecontoh.txt")
    filebuat.writeText("Ini adalah baris pertama\n ini kedua...!!!")

    filebuat.appendText("\nini baris ketiga ... !!!")
    filebuat.appendText("\nini baris keempat ... !!!")
    filebuat.appendText("\nini baris kelima ... !!!")

    val contohlist = listOf("Nasi goreng", "Bakso", "Bakpia")
    filebuat.appendText("\n" + contohlist.joinToString(separator = "\n"))

    println("\n=== cara nulis isi contet ===")
    filebuat.printWriter().use {
            out ->
        out.println("ini contoh baris pertama pakai printerwriter, 20. 3.8")
        out.println("ini contoh baris kedua  pakai printerwriter, 20. 3.8")
        out.println("ini contoh baris  ketiga pertama pakai printerwriter, 20. 3.8")
    }


}