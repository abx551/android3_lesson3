import kotlin.String

sealed class Character(
    val name: String,
    val weaponType: WeaponType) {
    abstract val ability: String

    class Warrior(override val ability: String) : Character(WARRIOR, WeaponType.SWORD)
    class Mage(val spell: String, override val ability: String) : Character (MAGE, WeaponType.STICK)
    class Archer(override val ability: String) : Character (ARCHER, WeaponType.BOW)

    companion object{


        const val WARRIOR = "Рендельф"
        const val MAGE = "Микаэль"
        const val ARCHER = "Гога"
    }
}