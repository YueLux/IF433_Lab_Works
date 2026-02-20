package oop_00000130600_RioRivaldi_week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("===== MENU UTAMA =====")
    println("1. Input Mahasiswa")
    println("2. Sistem Denda Perpustakaan")
    println("3. Mini RPG Battle")
    print("Pilih menu: ")
    val menu = scanner.nextInt()
    scanner.nextLine()

    when (menu) {

        // =============================
        // STUDENT
        // =============================
        1 -> {
            println("1. Daftar dengan jurusan")
            println("2. Daftar tanpa jurusan")
            print("Pilih opsi: ")
            val option = scanner.nextInt()
            scanner.nextLine()

            print("Masukkan NIM: ")
            val nim = scanner.nextLine()

            print("Masukkan Nama: ")
            val name = scanner.nextLine()

            if (option == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()

                print("Masukkan GPA: ")
                val gpa = scanner.nextDouble()

                val student = Student(nim, name, major, gpa)
                student.printInfo()

            } else {
                val student = Student(nim, name)
                student.printInfo()
            }
        }

        // =============================
        // LOAN SYSTEM
        // =============================
        2 -> {
            print("Judul Buku: ")
            val title = scanner.nextLine()

            print("Nama Peminjam: ")
            val borrower = scanner.nextLine()

            print("Lama Pinjam (hari): ")
            var duration = scanner.nextInt()

            if (duration < 0) {
                duration = 1
            }

            val loan = Loan(title, borrower, duration)
            loan.printLoanInfo()
        }

        // =============================
        // MINI RPG
        // =============================
        3 -> {
            print("Masukkan Nama Hero: ")
            val heroName = scanner.nextLine()

            print("Masukkan Base Damage: ")
            val damage = scanner.nextInt()

            val hero = Hero(heroName, damage)
            var enemyHp = 100

            while (hero.isAlive() && enemyHp > 0) {

                println("\n===== BATTLE MENU =====")
                println("1. Serang")
                println("2. Kabur")
                print("Pilih aksi: ")

                val action = scanner.nextInt()

                if (action == 1) {
                    hero.attack("Enemy")
                    enemyHp -= hero.baseDamage
                    if (enemyHp < 0) enemyHp = 0

                    println("HP Enemy: $enemyHp")

                    if (enemyHp > 0) {
                        val enemyDamage = (10..20).random()
                        println("Enemy menyerang balik!")
                        hero.takeDamage(enemyDamage)
                        println("HP $heroName: ${hero.hp}")
                    }

                } else {
                    println("Kamu kabur dari pertarungan!")
                    break
                }
            }

            println("\n===== HASIL PERTARUNGAN =====")
            if (hero.isAlive() && enemyHp == 0) {
                println("$heroName MENANG!")
            } else if (!hero.isAlive()) {
                println("Enemy MENANG!")
            } else {
                println("Pertarungan selesai.")
            }
        }

        else -> println("Menu tidak valid.")
    }
}