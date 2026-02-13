package oop_00000130600_RioRivaldi_Week01

fun main() {
    val gameTitle = "Black Myth: Wukong"
    val price = 750_000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500_000) (price * 80) / 100
    else (price * 90) / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== SteamKW Receipt ===")
    println("Game Title : $title")
    println("Final Price: Rp $finalPrice")
    println("Note       : ${note ?: "Tidak ada catatan"}")
}
