import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Выберите действие для персонажа 1 - Атака, 0 - Защита ")
    println("---------------------------------")
    print("Здесь писать:")

    val action = scanner.nextInt()
    when (action) {
        0 -> {
            val warrior = Character.Warrior("смог защититься")
            val mage = Character.Mage("защититься используя посох")
            val archer = Character.Archer("смогла защититься")
            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }

        1 -> {
            val warrior = Character.Warrior("замахнулся клинком")
            val mage = Character.Mage("использует посох")
            val archer = Character.Archer("выстрелил из лука")
            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)
            val hill = object {
                val name = "Ариэль"
                fun hill() {
                    println("$name Вылечил всех")
                }
            }
            hill.hill()
        }
    }
}