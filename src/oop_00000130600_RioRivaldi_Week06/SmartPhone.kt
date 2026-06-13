package oop_00000130143_SHIFFAQALBIANALFARYSI.week06

class SmartPhone : Camera, Phone{
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println("Sistem Operasi smartphone berhasil booting.")
    }
}