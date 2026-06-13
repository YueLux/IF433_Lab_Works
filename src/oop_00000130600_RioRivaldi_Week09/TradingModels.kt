package oop_00000130600_RioRivaldi_Week09

data class TradeLog(
    val pair:     String,
    val position: String,
    val leverage: Int,
    val roe:      Double,
    val status:   String
)