package oop_00000130600_RioRivaldi_Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}