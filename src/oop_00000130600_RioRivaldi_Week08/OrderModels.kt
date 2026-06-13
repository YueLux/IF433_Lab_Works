package oop_00000130600_RioRivaldi_Week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val Address: Address?)
class Order(val deliveryDetail: DeliveryDetails?, val totalPrice: kotlin.Int?)