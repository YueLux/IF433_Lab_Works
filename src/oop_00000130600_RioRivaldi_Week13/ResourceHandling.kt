package oop_00000130600_RioRivaldi_Week13

import java.io.File
import java.nio.file.Files

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("src/oop_00000130143_SHIFFAQALBIANALFARYSI/week13/unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")

    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("src/oop_00000130143_SHIFFAQALBIANALFARYSI/week13/safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

    println("\n=== TEST BUFFERED READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}