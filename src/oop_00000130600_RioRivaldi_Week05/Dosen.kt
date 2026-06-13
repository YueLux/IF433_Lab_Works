package oop_00000130143_SHIFFAQALBIANALFARYSI.week05

class Dosen(nama: String, val nidn: String): Pegawai (nama){
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevis RPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}