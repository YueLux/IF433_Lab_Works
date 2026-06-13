package oop_00000130600_RioRivaldi_Week14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student"  -> price * 0.80  // diskon 20%
            "member"   -> price * 0.85  // diskon 15%
            "employee" -> price * 0.70  // diskon 30%
            else       -> price
        }
    }
}