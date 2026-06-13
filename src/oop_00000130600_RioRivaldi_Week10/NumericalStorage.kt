package oop_00000130600_RioRivaldi_Week10

// LANGKAH 1: Upper Bound <T : Number> — hanya menerima tipe angka
class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

// LANGKAH 2: Where clause — T harus bisa dibandingkan (Comparable)
fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}