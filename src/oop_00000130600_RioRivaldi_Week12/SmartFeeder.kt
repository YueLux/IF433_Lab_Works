package oop_00000130600_RioRivaldi_Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {

    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println(" Kibble berhasil dikeluarkan! ($requestedGram gr)")
    return availableGram - requestedGram
}

fun main() {
    println("=== Smart Pet Feeder System ===")
    var currentKibbleStock = 50
    println("Stok kibble awal: $currentKibbleStock gr\n")

    println("────────────────────────────────────────")
    println("   JADWAL MAKAN PAGI (Try-Catch)")
    println("   Meminta: 80 gr | Stok: $currentKibbleStock gr")
    println("────────────────────────────────────────")

    try {
        val sisaStok = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = sisaStok

    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE${e.message}")
        println("Tindakan: Harap periksa dan bersihkan dispenser secara manual.")

    } catch (e: FoodEmptyException) {
        println("ERROR STOK ${e.message}")
        println("Tindakan: Segera isi ulang wadah kibble!")

    } catch (e: Exception) {
        println(" ERROR UMUM Terjadi kesalahan tidak terduga: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("────────────────────────────────────────")
    println("   JADWAL MAKAN SORE (runCatching Pipeline)")
    println("   Stok diisi ulang ke 1000 gr")
    println("   Meminta: 30 gr | Stok: 1000 gr")
    println("────────────────────────────────────────")

    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println(" Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }

        .onFailure { error ->
            println("   Peringatan ke Pemilik: ${error.message}")
            println("   (Opsional: Berikan chicken jerky secara manual)")
        }

    println("────────────────────────────────────────")
    println("   RINGKASAN AKHIR SISTEM")
    println("   Stok kibble tersisa: $currentKibbleStock gr")
    println("────────────────────────────────────────")

    println()
    println("EXTRA: Uji Semua Skenario Error")

    println("\nSkenario Dispenser Macet:")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 500, isJammed = true)
    }.onSuccess {
        println("Sukses, sisa: $it gr")
    }.onFailure { error ->
        println(" Peringatan ke Pemilik: ${error.message}")
    }

    println("\n Skenario Porsi Invalid (0 gr):")
    runCatching {
        dispenseKibble(requestedGram = 0, availableGram = 500, isJammed = false)
    }.onSuccess {
        println("Sukses, sisa: $it gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
    }

}