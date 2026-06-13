package oop_00000130600_RioRivaldi_Week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

fun main() {

    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long",  500.0,  120.5),
        TradeRecord(2, "ETHUSDT", "Short", 300.0,  -45.0),
        TradeRecord(3, "SOLUSDT",  "Long",  200.0,  80.25)
    )

    saveTrades(trades, "crypto_trades.csv")
    println("Trade records berhasil disimpan ke crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Baris data korup berhasil di-inject ke file CSV.")

    println("\n=== MEMUAT DATA TRANSAKSI ===")
    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== DAFTAR TRANSAKSI VALID ===")
    loadedData.forEach { trade ->
        println("[ID:${trade.id}] ${trade.symbol} | ${trade.type} | Margin: ${trade.margin} | PnL: ${trade.pnl}")
    }
    println("\n==== TOTAL PnL BERSIH: $totalPnl ====")
}