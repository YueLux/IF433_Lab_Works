package oop_00000130143_SHIFFAQALBIANALFARYSI.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman.")
        }
    }
}