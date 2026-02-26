package oop_00000130600_RioRivaldi.week03

fun main() {

    println("========== TEST EMPLOYEE ==========")
    val employee = Employee("Rio")

    employee.salary = -5000.0
    employee.salary = 5000.0
    employee.updatePerformanceRating(4)

    println("Nama: ${employee.name}")
    println("Salary: ${employee.salary}")
    println("Bonus: ${employee.bonus}")



    println("\n========== TEST WEAPON ==========")
    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier: ${sword.tier}")



    println("\n========== TEST PLAYER ==========")
    val player = Player("RioGamer")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}