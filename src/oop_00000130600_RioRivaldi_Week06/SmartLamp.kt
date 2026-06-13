package oop_00000130143_SHIFFAQALBIANALFARYSI.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}