package oop_00000130600_RioRivaldi_Week11

import kotlin.text.category

fun main(){
    println("=== SMART HOME CONFIGURATION PIPELINE ===")
    val homeDevices = mutableListOf<SmartDevice>()

    println("\n[SETUP] Mengonfigurasi perangkat pencahayaan...")
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        println("(LOG) Lampu pintar berhasil dikonfigurasi: ${it.name}")
        homeDevices.add(it)
    }

    println("\n[SETUP] Mengonfigurasi perangkat keamanan...")
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    println("\n[SETUP] Mengonfigurasi perangkat HVAC...")
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)
    println("(LOG) AC unit ditambahkan: ${acUnit.name}")

    // Tambah alat pakan peliharaan
    println("\n[SETUP] Mengonfigurasi perangkat Pet Care...")
    val petFeeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    homeDevices.add(petFeeder)
    println("(LOG) Auto feeder ditambahkan: ${petFeeder.name}")

    println("\n[SEARCH] Mencari perangkat kamera...")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("Perangkat ditemukan:")
        println(it.diagnose())
    }

    println("\n[SUMMARY] Dashboard Ringkasan:")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size} perangkat")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total konsumsi daya: $totalPower Watt")

    println("=== DIAGNOSTIK SEMUA PERANGKAT ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }

    println("\n Smart Home Configuration Pipeline selesai dieksekusi.")


}