package oop_00000130600_RioRivaldi_week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand: Beep Beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand meningkatkan kecepatan dengan mesin bensin.")
    }

    fun openTrunk() {
        println("Bagasi $brand dibuka.")
    }
}