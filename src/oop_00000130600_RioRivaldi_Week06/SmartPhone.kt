package oop_00000130600_RioRivaldi_Week06

class SmartPhone : Camera, Phone{
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println("Sistem Operasi smartphone berhasil booting.")
    }
}