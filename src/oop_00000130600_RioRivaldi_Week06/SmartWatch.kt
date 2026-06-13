package oop_00000130600_RioRivaldi_Week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari Perangkat HP di sekitar untuk pairing...")
    }
    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}