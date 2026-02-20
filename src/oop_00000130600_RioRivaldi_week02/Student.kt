package oop_00000130600_RioRivaldi_week02

class Student(
    val nim: String,
    var name: String,
    var major: String,
    var gpa: Double = 0.0
) {

    init {
        if (nim.isBlank()) {
            println("Warning: NIM tidak boleh kosong!")
        }

        if (name.isBlank()) {
            println("Warning: Nama tidak boleh kosong!")
        }

        if (gpa < 0.0 || gpa > 4.0) {
            println("Warning: GPA tidak valid (0.0 - 4.0)")
        }
    }

    // Secondary Constructor
    constructor(nim: String, name: String) : this(
        nim,
        name,
        "Non-Matriculated",
        0.0
    )

    fun printInfo() {
        println("===== DATA MAHASISWA =====")
        println("NIM   : $nim")
        println("Nama  : $name")
        println("Major : $major")
        println("GPA   : $gpa")
    }
}