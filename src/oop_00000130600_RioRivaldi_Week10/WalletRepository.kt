package oop_00000130600_RioRivaldi_Week10

// CHECKPOINT 12: Generic Repository untuk menyimpan berbagai entitas
class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // CHECKPOINT 14: Search logic — filter berdasarkan toString() yang mengandung query
    fun search(query: String): List<T> {
        return items.filter { item ->
            item.toString().contains(query, ignoreCase = true)
        }
    }
}