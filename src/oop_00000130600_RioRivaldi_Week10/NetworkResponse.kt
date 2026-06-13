package oop_00000130600_RioRivaldi_Week10

// Generic wrapper untuk simulasi response dari API/jaringan
data class ApiResponse<T>(val status: String, val data: T)