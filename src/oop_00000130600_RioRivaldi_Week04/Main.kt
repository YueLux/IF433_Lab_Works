package oop_nim_nama.week04

fun main() {

    println("===== GUIDED LAB =====")

    val car = Car(
        "Toyota",
        4
    )

    car.accelerate()
    car.honk()
    car.openTrunk()

    println("\n===== TASK 1 =====")

    val tesla = ElectricCar(
        "Tesla",
        4,
        85
    )

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n===== TASK 2 =====")

    val manager = Manager(
        "Budi",
        10000000
    )

    val developer = Developer(
        "Rio",
        8000000,
        "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}