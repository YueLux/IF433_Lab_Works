package oop_00000130600_RioRivaldi_Week14

import java.io.File

// ============================================================
// CHECKPOINT 19 — FIX SRP & DIP
// ============================================================

// Strategy Pricing
interface PricingStrategy {
    fun calculate(price: Double): Double
}

// Regular Pricing
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

// VIP Pricing
class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

// Premium Pricing
class PremiumPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.80
    }
}

// ============================================================
// Repository
// ============================================================

interface OrderRepository {
    fun saveOrder(
        itemName: String,
        finalPrice: Double,
        pricingLabel: String
    )
}

class CsvOrderRepository(
    private val filePath: String = "orders.csv"
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        pricingLabel: String
    ) {
        val file = File(filePath)

        file.appendText(
            "$itemName,$finalPrice,$pricingLabel\n"
        )

        println("[CsvOrderRepository] Order disimpan ke $filePath")
    }
}

// ============================================================
// Notification
// ============================================================

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("[EmailNotifier] Email terkirim: $message")
    }
}

// ============================================================
// Processor
// ============================================================

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricing: PricingStrategy
    ) {

        val finalPrice = pricing.calculate(basePrice)

        val label = pricing::class.simpleName ?: "Unknown"

        println(
            "Memproses pesanan $itemName seharga Rp $finalPrice ($label)"
        )

        repo.saveOrder(
            itemName,
            finalPrice,
            label
        )

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi! Total: Rp $finalPrice"
        )
    }
}

// ============================================================
// MAIN
// ============================================================

fun main() {

    val repo = CsvOrderRepository()

    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repo,
        notifier
    )

    println("=== E-Commerce Order Processing ===")
    println()

    processor.processOrder(
        "Laptop",
        15_000_000.0,
        RegularPricing()
    )

    println()

    processor.processOrder(
        "Headset",
        500_000.0,
        VipPricing()
    )

    println()

    processor.processOrder(
        "Keyboard",
        800_000.0,
        PremiumPricing()
    )
}