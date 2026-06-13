package oop_00000130143_SHIFFAQALBIANALFARYSI.week07

fun main() {
    /* println("=== TEST SINGLETON ===")
     println("Status: ${DatabaseManager.connectionStatus}")
     DatabaseManager.connect()

     println("\n===TEST COMPANION OBJECTS ===")
     val client = NetworkClient.createClient()

     println("\n=== TEST REGULAR CLASS ===")
     val reg1 = RegularUser("Alice", 22)
     val reg2 = RegularUser("Alice", 22)

     println(reg1)
     println("Sama ? ${reg1 == reg2}")

     data class DataUsers(val name: String, val age: Int)
     println("\n=== TEST DATA CLASS ===")
     val data1 = DataUsers("Alice", 22)
     val data2 = DataUsers("Alice", 22)
     println(data1)
     println("Sama? ${data1 == data2}")

     val data3 = data1.copy(age = 23)
     println("Hasil Copy: $data3")

     val (userName, userAge) = data1
     println("Destructured: $userName berumur $userAge")

     println("\n=== TEST SEALED CLASS ===")

     val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

     val uiMessage = when (response) {
         is ApiResponse.Success -> "Tampilkan: ${response.data}"
         is ApiResponse.Error -> "Munculkan alert: ${response.message}"
         ApiResponse.Loading -> "Tampilkan Spinner"
     }

     println(uiMessage)*/

    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)

    val weapon = Weapon.forgeStarterSword()
    println("${weapon.item.name} ${weapon.item.damage} ${weapon.durability}")

    val upgradedItem = weapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}