package oop_00000130143_SHIFFAQALBIANALFARYSI.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}