package oop_00000130600_RioRivaldi.week03

class Employee(val name: String) {

    var salary: Double = 0.0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
            } else {
                field = value   // ✅ Backing field (bukan this.salary)
            }
        }

    private var performanceRating: Int = 0

    fun updatePerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Rating harus antara 1 - 5")
        }
    }

    val bonus: Double
        get() = salary * (performanceRating * 0.1)
}