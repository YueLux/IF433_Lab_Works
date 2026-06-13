package oop_00000130600_RioRivaldi_Week06

/*fun proccessCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout: ....")
    method.pay(amount)
}*/

/*fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = SmartPhone()
    myPhone.turnOn()

    val  pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    proccessCheckout(method = pay1, amount = 50000.0)
    proccessCheckout(method = pay2, amount = 150000.0)
}*/

fun main() {

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== Security Mode Aktif ===")
    hub.activateSecurityMode()

    println("\n=== Matikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}