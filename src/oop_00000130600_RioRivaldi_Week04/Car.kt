package oop_nim_nama.week04

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