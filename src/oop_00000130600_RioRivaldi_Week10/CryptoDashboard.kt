package oop_00000130600_RioRivaldi_Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("-------------------------------")
    response.data.forEach { coin ->
        println("Koin : ${coin.name}")
        println("Saldo: ${coin.balance}")
        println("-------------------------------")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TXN-001", 0.25))
    txRepo.add(Transaction("TXN-002", 150.0))
    txRepo.add(Transaction("TXN-003", 0.05))

    println("\n=== RIWAYAT TRANSAKSI ===")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Jumlah: ${tx.amount}")
    }

    println("\n=== HASIL PENCARIAN 'BTC' ===")
    val searchResult = coinRepo.search("BTC")
    searchResult.forEach { coin ->
        println("Ditemukan: ${coin.name} | Saldo: ${coin.balance}")
    }
}