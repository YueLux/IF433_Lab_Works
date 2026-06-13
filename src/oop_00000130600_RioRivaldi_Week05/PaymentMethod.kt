package oop_00000130600_RioRivaldi_week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}