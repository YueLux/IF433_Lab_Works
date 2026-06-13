package oop_nim_nama.week04

open class Vehicle(
    val brand: String
) {

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    open fun honk() {
        println("$brand membunyikan klakson.")
    }
}