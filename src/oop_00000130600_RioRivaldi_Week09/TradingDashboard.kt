package oop_00000130600_RioRivaldi_Week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10,  -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  15,   8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT",  5, -12.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,  22.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 10,   3.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  10,   0.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT",  5,  -2.4, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS (WIN) ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS (LOSS) ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- UNIQUE TRADING PAIRS ---")
    println(uniquePairs)

    val totalClosed = closedTrades.size
    val wins        = winningTrades.size
    val losses      = losingTrades.size
    val winRate     = if (totalClosed > 0)
        (wins.toDouble() / totalClosed * 100)
    else 0.0
    println("\n--- SUMMARY ---")
    println("Total Closed Trades : $totalClosed")
    println("Wins  : $wins | Losses: $losses")
    println("Win Rate            : ${"%.1f".format(winRate)}%")


}